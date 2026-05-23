import java.util.Scanner;

class Abiturient {
    private int id;
    private String surname;
    private String address;
    private String phone;
    private double averageScore;

    public Abiturient(int id, String surname, String address,
                      String phone, double averageScore) {
        this.id = id;
        this.surname = surname;
        this.address = address;
        this.phone = phone;
        this.averageScore = averageScore;
    }

    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void showInfo() {
        System.out.printf("%-10d %-15s %-20s %-15s %-10.2f\n",
                id, surname, address, phone, averageScore);
    }
}

public class Laba3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Abiturient[] students = new Abiturient[5];

        System.out.println("Введення даних абітурієнтів:\n");

        for (int i = 0; i < students.length; i++) {

            int id;
            String surname;
            String address;
            String phone;
            double score;

            while (true) {
                try {
                    System.out.print("Введіть ID абітурієнта: ");
                    id = scanner.nextInt();

                    if (id <= 0) {
                        throw new Exception("ID повинен бути більше 0!");
                    }

                    break;

                } catch (Exception e) {
                    System.out.println("Помилка: " + e.getMessage());
                    scanner.nextLine();
                }
            }

            scanner.nextLine();

            System.out.print("Введіть прізвище: ");
            surname = scanner.nextLine();

            System.out.print("Введіть адресу: ");
            address = scanner.nextLine();

            System.out.print("Введіть телефон: ");
            phone = scanner.nextLine();

            while (true) {
                try {
                    System.out.print("Введіть середній бал (0-200): ");
                    score = scanner.nextDouble();

                    if (score < 0 || score > 200) {
                        throw new Exception("Бал повинен бути в межах 0-200!");
                    }

                    break;

                } catch (Exception e) {
                    System.out.println("Помилка: " + e.getMessage());
                    scanner.nextLine();
                }
            }

            students[i] = new Abiturient(id, surname, address, phone, score);

            System.out.println("--------------------------------------");
        }

        System.out.println("\nСписок усіх абітурієнтів:");

        System.out.printf("%-10s %-15s %-20s %-15s %-10s\n",
                "ID", "Прізвище", "Адреса", "Телефон", "Бал");

        for (Abiturient student : students) {
            student.showInfo();
        }

        System.out.println("\nАбітурієнти з незадовільними оцінками (<100):");

        System.out.printf("%-10s %-15s %-20s %-15s %-10s\n",
                "ID", "Прізвище", "Адреса", "Телефон", "Бал");

        for (Abiturient student : students) {
            if (student.getAverageScore() < 100) {
                student.showInfo();
            }
        }

        double limit;

        while (true) {
            try {
                System.out.print("\nВведіть мінімальний бал для пошуку: ");
                limit = scanner.nextDouble();

                if (limit < 0 || limit > 200) {
                    throw new Exception("Бал повинен бути в межах 0-200!");
                }

                break;

            } catch (Exception e) {
                System.out.println("Помилка: " + e.getMessage());
                scanner.nextLine();
            }
        }

        System.out.println("\nАбітурієнти з балом вище заданого:");

        System.out.printf("%-10s %-15s %-20s %-15s %-10s\n",
                "ID", "Прізвище", "Адреса", "Телефон", "Бал");

        for (Abiturient student : students) {
            if (student.getAverageScore() > limit) {
                student.showInfo();
            }
        }

        scanner.close();
    }
}

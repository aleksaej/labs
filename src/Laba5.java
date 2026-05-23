
import java.util.ArrayList;
import java.util.Scanner;
public class Laba5 {
    private String model;
    private ArrayList<Component> components;


    public Laba5(String model) {
        this.model = model;
        components = new ArrayList<>();
        System.out.println("Створено телефон: " + model);
    }

  
    class Component {
        private String name;
        private String purpose;
        private String properties;

        public Component(String name, String purpose, String properties) {
            this.name = name;
            this.purpose = purpose;
            this.properties = properties;

            System.out.println("Додано компонент: " + name);
        }

        public void displayInfo() {
            System.out.println("Назва: " + name);
            System.out.println("Призначення: " + purpose);
            System.out.println("Властивості: " + properties);
            System.out.println("--------------------------------");
        }

        public String getName() {
            return name;
        }
    }

   
    public void addComponent(String name, String purpose, String properties) {
        Component component = new Component(name, purpose, properties);
        components.add(component);
    }

 
    public void displayPhoneInfo() {
        System.out.println("\n ІНФОРМАЦІЯ ПРО ТЕЛЕФОН ");
        System.out.println("Модель телефону: " + model);

        System.out.println("\nКомпоненти телефону:");

        for (Component component : components) {
            component.displayInfo();
        }
    }

    
    public void searchComponent(String searchName) {
        boolean found = false;

        System.out.println("\nПошук компоненту: " + searchName);

        for (Component component : components) {
            if (component.getName().equalsIgnoreCase(searchName)) {
                System.out.println("Компонент знайдено!");
                component.displayInfo();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Компонент не знайдено.");
        }
    }
}

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("ЛАБОРАТОРНА РОБОТА №5");
        System.out.println("ДОСЛІДЖЕННЯ ВКЛАДЕНИХ КЛАСІВ В JAVA\n");

        
        System.out.print("Введіть модель телефону: ");
        String model = scanner.nextLine();

        Laba5 phone = new Laba5(model);

        
        System.out.print("\nВведіть кількість компонентів: ");
        int count = scanner.nextInt();
        scanner.nextLine();

       
        for (int i = 0; i < count; i++) {

            System.out.println("\nКомпонент #" + (i + 1));

            System.out.print("Назва компоненту: ");
            String name = scanner.nextLine();

            System.out.print("Призначення: ");
            String purpose = scanner.nextLine();

            System.out.print("Властивості: ");
            String properties = scanner.nextLine();

            phone.addComponent(name, purpose, properties);
        }

      
        phone.displayPhoneInfo();

       
        System.out.print("\nВведіть назву компоненту для пошуку: ");
        String search = scanner.nextLine();

        phone.searchComponent(search);

        scanner.close();

        System.out.println("\nПрограма завершена.");
    }
}

import java.io.*;
import java.util.Scanner;

public class Laba4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

          
            System.out.print("Введіть шлях до вхідного файлу: ");
            String inputFile = scanner.nextLine();

          
            System.out.print("Введіть шлях до вихідного файлу: ");
            String outputFile = scanner.nextLine();

           
            FileReader fr = new FileReader(inputFile);
            BufferedReader reader = new BufferedReader(fr);

       
            FileWriter fw = new FileWriter(outputFile);
            BufferedWriter writer = new BufferedWriter(fw);

            String line;

            System.out.println("\nПочаток обробки файлу...\n");

          
            while ((line = reader.readLine()) != null) {

                System.out.println("Прочитаний рядок:");
                System.out.println(line);

             
                String modifiedLine = line.replace("if", "fi");

                System.out.println("Після заміни:");
                System.out.println(modifiedLine);
                System.out.println();

             
                writer.write(modifiedLine);
                writer.newLine();
            }

      
            reader.close();
            writer.close();

            System.out.println("Обробка завершена.");
            System.out.println("Результат записано у файл: " + outputFile);

        } catch (IOException e) {

            System.out.println("Помилка роботи з файлом!");
            System.out.println(e.getMessage());
        }
    }
}
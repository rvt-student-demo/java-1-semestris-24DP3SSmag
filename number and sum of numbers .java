import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = 0;
        int sum = 0;
        int number;

        System.out.println("Ievadiet skaitļus. Ievadiet 0, lai beigtu.");

        while (true) {
            System.out.print("Ievadi skaitli: ");
            number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            count = count + 1;
            sum = sum + number;
        }

        System.out.println("Ievadīto skaitļu skaits: " + count);
        System.out.println("Skaitļu summa: " + sum);
        
        scanner.close();
    }
}
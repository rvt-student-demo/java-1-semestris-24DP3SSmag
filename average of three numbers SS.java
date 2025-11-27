import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int num1 = scanner.nextInt();

        System.out.println("Give the second number:");
        int num2 = scanner.nextInt();

        System.out.println("Give the third number:");
        int num3 = scanner.nextInt();

        scanner.close();

        double average = (double) (num1 + num2 + num3) / 3;

        System.out.println("The average is: " + average);
    }
}
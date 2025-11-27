import java.util.Scanner;

public class Delikatese {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ievadi preci: ");
        String item = scanner.nextLine();

        System.out.print("Ievadi cenu: ");
        double price = scanner.nextDouble();

        System.out.print("Ekspress piegāde (0=nē, 1=jā): ");
        int express = scanner.nextInt();

        double deliveryFee = 0.0;

        if (express == 1) {
            deliveryFee = 5.00; 
        } else {
            if (price < 10.00) {
                deliveryFee = 2.00;
            } else {
                deliveryFee = 0.00;
            }
        }

        double total = price + deliveryFee;

        System.out.println("\nRēķins:");
        System.out.printf("%-15s %.2f\n", item, price);
        System.out.printf("%-15s %.2f\n", "piegāde", deliveryFee);
        System.out.printf("%-15s %.2f\n", "kopā", total);
        
        scanner.close();
    }
}
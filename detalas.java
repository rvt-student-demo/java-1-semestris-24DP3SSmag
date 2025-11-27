import java.util.Scanner;

public class PasutijumaParbauditajs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int boltPrice = 5;
        final int nutPrice = 3;
        final int washerPrice = 1;

        System.out.print("Skrūvju skaits: ");
        int boltCount = scanner.nextInt();

        System.out.print("Uzgriežņu skaits: ");
        int nutCount = scanner.nextInt();

        System.out.print("Paplākšņu skaits: ");
        int washerCount = scanner.nextInt();
        
        scanner.close();

        boolean notEnoughNuts = nutCount < boltCount;
        boolean notEnoughWashers = washerCount < (2 * boltCount);
        boolean errorFound = false;
        
        System.out.println("");

        if (notEnoughNuts && notEnoughWashers) {
            System.out.println("Pārbaudi pasūtījumu: par maz uzgriežņu un par maz paplākšņu");
            errorFound = true;
        } else if (notEnoughNuts) {
            System.out.println("Pārbaudi pasūtījumu: par maz uzgriežņu");
            errorFound = true;
        } else if (notEnoughWashers) {
            System.out.println("Pārbaudi pasūtījumu: par maz paplākšņu");
            errorFound = true;
        }

        if (!errorFound) {
            System.out.println("Pasūtījums ir kārtībā.");
        }

        int totalPrice = (boltCount * boltPrice) + (nutCount * nutPrice) + (washerCount * washerPrice);

        System.out.println("Kopējā cena: " + totalPrice);
    }
}
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.print("Pirmais skaitlis? ");
        int first = scanner.nextInt();

        System.out.print("Pēdējais skaitlis? ");
        int last = scanner.nextInt();
        
        scanner.close();

        int current = first;
        while (current <= last) {
            sum = sum + current;
            current = current + 1;
        }

        System.out.println("Summa ir: " + sum);
    }
}
import java.util.Scanner;
import java.util.ArrayList;

public class JArrayList {

    public static void main(String[] args) {
    }

    public static void onlyTheseNumbers() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Ievadiet skaitļus. -1, lai beigtu ievadi.");
        while (true) {
            System.out.print("Skaitlis: ");
            int input = scanner.nextInt();
            if (input == -1) {
                break;
            }
            numbers.add(input);
        }

        System.out.print("No kura indeksa? (ieskaitot): ");
        int start = scanner.nextInt();

        System.out.print("Līdz kuram indeksam? (ieskaitot): ");
        int end = scanner.nextInt();
        
        for (int i = start; i <= end; i++) {
            System.out.println(numbers.get(i));
        }
    }

    public static void listSize() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.println("Ievadiet vārdus. Tukša rinda, lai beigtu ievadi.");
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            list.add(input);
        }

        System.out.println("Kopā: " + list.size());
    }

    public static void onTheList() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.println("Ievadiet vārdus. Tukša rinda, lai beigtu saraksta veidošanu.");
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            list.add(input);
        }

        System.out.print("Meklēt: ");
        String search = scanner.nextLine();

        if (list.contains(search)) {
            System.out.println(search + " tika atrasts!");
        } else {
            System.out.println(search + " netika atrasts!");
        }
    }

    public static void removeLast(ArrayList<String> strings) {
        if (!strings.isEmpty()) {
            strings.remove(strings.size() - 1);
        }
    }
}
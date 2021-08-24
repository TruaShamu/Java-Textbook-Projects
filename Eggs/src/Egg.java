import java.util.Scanner;

public class Egg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kirby Dance!!! (>'_')> <('_'<)");
        System.out.println("How many eggs do you have? ");
        int eggs = sc.nextInt();
        int gross = eggs / 144;
        int dozen = (eggs - 144 * gross) / 12;
        int lo = (eggs - 144 * gross) % 12;
        System.out.println("You have " + gross + " gross eggs, " + dozen + " dozen eggs, and " + lo + "  leftover eggs");
    }
}

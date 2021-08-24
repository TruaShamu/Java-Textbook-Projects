import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many pennies? >.<");
        int pennies = sc.nextInt();
        System.out.println("How many nickles? >.<");
        int nickles = sc.nextInt();
        System.out.println("How many dimes? >.<");
        int dimes = sc.nextInt();
        double money = 0.01 * pennies + 0.05 * nickles + 0.1 * dimes;
        System.out.println("Your change is  $" + money);


    }
}

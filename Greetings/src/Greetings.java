import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = sc.nextLine();
        String name2 = name.toUpperCase();
        System.out.println("Hi, " + name2 + ". Nice to meet you!");
    }
}

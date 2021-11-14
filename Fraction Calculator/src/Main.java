import java.util.Scanner;

public class Main {
    public static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.println("This program is a fraction calculator");
        System.out.println("It will add, subtract, multiply and divide until you type Q to quit.");
        System.out.println("Please enter your fractions in the form a/b, where a and b are integers.");
        printBar();

        for (int i = 0; ; i++) {
            String operation = getOper();
            if (operation.equals("Q") || operation.equals("q")) {
                System.exit(0);
            }
            Fraction frac1 = getFrac();
            Fraction frac2 = getFrac();
            if (operation.equals("*")) {
                frac1.multiply(frac2);
            }
            if (operation.equals("+")) {
                frac1.add(frac2);
            }
            if (operation.equals("-")) {
                frac1.subtract(frac2);
            }
            if (operation.equals("/")) {
                frac1.divide(frac2);
            }
            if (operation.equals("=")) {
                frac1.equals(frac2);
            }


        }

    }

    public static Fraction getFrac() {
        System.out.println("Please enter a fraction");
        String str = sc.nextLine();
        while (!validFrac(str)) {
            System.out.println("Please enter a fraction");
            str = sc.nextLine();
        }
        int slashLoc = findSlash(str);
        if (slashLoc == -1) {
            return new Fraction(Integer.parseInt(str), 1);
        }
        int num = Integer.parseInt(str.substring(0, slashLoc));
        int den = Integer.parseInt(str.substring(slashLoc + 1));
        return new Fraction(num, den);

    }

    public static String getOper() {
        System.out.println("Please enter an operation");
        String str = sc.nextLine();
        while (!validOper(str)) {
            System.out.println("Please enter an operation");
            str = sc.nextLine();
        }
        return str;

    }

    public static void printBar() {
        System.out.println("-----------------------------------------------------------------------------");
    }

    public static boolean validOper(String input) {
        if (!input.equals("+") && !input.equals("-") && !input.equals("=") && !input.equals("/") && !input.equals("*") && !input.equals("Q") && !input.equals("q")) {
            return false;
        }
        return true;
    }

    public static boolean validFrac(String input) {
        if (isNumeric(input)) {
            return true;
        }
        //Is this input valid?
        int slashLoc = findSlash(input);
        int dashLoc = findDash(input);
        if (slashLoc == -1 || dashLoc > 0) {
            return false;
        }
        String num = input.substring(0, slashLoc);
        String den = input.substring(slashLoc + 1);
        //System.out.println(num);
        if (isNumeric(num) && isNumeric(den) && Integer.parseInt(den) != 0) {
            return true;
        }
        return false;
    }

    public static boolean isNumeric(String strNum) {
        //Is this string numeric
        if (strNum == null) {
            return false;
        }
        try {
            int d = Integer.parseInt(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static int findSlash(String input) {
        int slashLoc = -1;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '/') {
                slashLoc = i;
            }
        }
        return slashLoc;
    }

    public static int findDash(String input) {
        int slashLoc = -1;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '-') {
                slashLoc = i;
            }
        }
        return slashLoc;
    }
}

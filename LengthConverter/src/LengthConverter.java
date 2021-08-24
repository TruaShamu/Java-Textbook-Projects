public class LengthConverter {
    public static void main(String[] args) {
        double measurement;
        String units;
        double inches, feet, yards, miles;
        System.out.println("Enter measurements in inches, feet, yards, or miles");
        System.out.println("For example: 1 inch  17  feet   27.3 miles.");
        System.out.println("You can use abbreviations: in  ft  yd  mi");
        System.out.println("I will convert your input into the other units ");
        System.out.println("of measure.");
        System.out.println();
        while (true) {
            System.out.print("Enter your measurement, or 0 to end:  ");
            measurement = TextIO.getDouble();
            if (measurement == 0)
                break;
            units = TextIO.getlnWord();
            units = units.toLowerCase();
            if (units.equals("inch")) {
                inches = measurement;

            } else if (units.equals("foot")) {
                inches = measurement * 12;

            } else if (units.equals("yard")) {
                inches = measurement * 36;

            } else if (units.equals("mile")) {
                inches = measurement * 12 * 5280;

            } else {
                System.out.println("Sorry, but I don’t understand \""
                        + units + "\".");
                continue;
            }
            feet = inches / 12;
            yards = inches / 36;
            miles = inches / (12 * 5280);
            /* Output measurement in terms of each unit of measure. */
            System.out.println();
            System.out.println("That’s equivalent to:");
            System.out.printf("%12.5g", inches);
            System.out.println(" inches");
            System.out.printf("%12.5g", feet);
            System.out.println(" feet");
            System.out.printf("%12.5g", yards);
            System.out.println(" yards");
            System.out.printf("%12.5g", miles);
            System.out.println(" miles");
            System.out.println();

        }
        System.out.println();
        System.out.println("OK! Bye for now.");

    }
}

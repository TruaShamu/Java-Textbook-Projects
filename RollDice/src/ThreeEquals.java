public class ThreeEquals {
    public static void main(String[] args) {
        int rollequals = 1;
        int rolls = 0;
        int roll1 = -1;
        int roll2 = -2;
        while (rollequals <= 3) {
            while (roll1 != roll2) {
                roll1 = (int) (Math.random() * 6) + 1;
                roll2 = (int) (Math.random() * 6) + 1;
                rolls++;
                System.out.println("Roll 1: " + roll1 + ". Roll 2: " + roll2 + ".");
            }
            if (roll1 == roll2) {
                rollequals++;
                roll1 = -1;
                roll2 = -2;
            }


        }
        System.out.println("It took you " + rolls + " rolls.");
    }
}

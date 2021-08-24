// Chapter 3: Exercise 1
public class Main {
    public static void main(String[] args) {
        int rolls = 0;

        int roll1 = 0;
        int roll2 = 0;
        while (!(roll1 == 1 && roll2 == 1)) {
            roll1 = (int) (Math.random() * 6) + 1;
            roll2 = (int) (Math.random() * 6) + 1;
            int roll3 = roll1 + roll2;
            System.out.println("Roll 1: " + roll1 + ". Roll 2: " + roll2 + ". Total Roll: " + roll3 + ".");
            rolls++;
        }
        System.out.println("It took you " + rolls + " rolls to get a pair of Snake Eyes.");

    }


}

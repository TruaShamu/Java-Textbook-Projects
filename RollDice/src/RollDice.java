public class RollDice {
    public static void main(String[] args) {


        int roll1 = (int) (Math.random() * 6) + 1;
        int roll2 = (int) (Math.random() * 6) + 1;
        int roll3 = roll1 + roll2;
        System.out.println("Your first die comes up " + roll1);
        System.out.println("Your second die comes up " + roll2);
        System.out.println("Your total roll is " + roll3);
        //end

    }
}

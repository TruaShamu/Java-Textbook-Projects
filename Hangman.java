import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Hangman {
    private static char[] answer;
    private static char[] dispString;
    public static HashSet<Character> guessed;
    public static HashSet<Character> uniqueCharacters;
    public static int wrongGuess = 0;
    public static int rightGuess = 0;
    public static int lives = 6;
    public static Scanner sc;


    public static void main(String[] args) throws IOException {
        sc = new Scanner(System.in);
        guessed = new HashSet<>();
        uniqueCharacters = new HashSet<>();
        initialize();
        System.out.println(answer);
        System.out.println("UNIQUE LETTERS: " + uniqueCharacters.size());

        while (lives > 0 || rightGuess < uniqueCharacters.size()) {
            turn();
            if (rightGuess == uniqueCharacters.size()) {
                break;
            }
        }
        if (lives == 0) {
            printHangman();
            System.out.println("LOSE");
        } else {
            System.out.println("WIN");
        }


    }

    public static void printHangman() throws IOException {
        if (wrongGuess == 0) {
            readFile("hangmanImages/0wrong.txt");
        }
        if (wrongGuess == 1) {
            readFile("hangmanImages/1wrong.txt");
        }
        if (wrongGuess == 2) {
            readFile("hangmanImages/2wrong.txt");
        }
        if (wrongGuess == 3) {
            readFile("hangmanImages/3wrong.txt");
        }
        if (wrongGuess == 4) {
            readFile("hangmanImages/4wrong.txt");
        }
        if (wrongGuess == 5) {
            readFile("hangmanImages/5wrong.txt");
        }
        if (wrongGuess == 6) {
            readFile("hangmanImages/6wrong.txt");
        }
    }

    public static void turn() throws IOException {
        printHangman();
        System.out.println("RIGHT GUESSES: " + rightGuess);
        System.out.println(Arrays.toString(dispString));
        System.out.println("Next char");
        char s = sc.next().charAt(0);
        if (guessed.contains(s)) {
            System.out.println("Already guessed");
            turn();
        }
        guessed.add(s);
        if (correct(s)) {
            System.out.println("CORRECT");
            rightGuess++;
            replace(s);

        } else {
            System.out.println("INCORRECT");
            wrongGuess++;

        }

    }

    //@todo Is the guess correct?
    public static boolean correct(char oChar) {
        for (char c : answer) {
            if (oChar == c) {
                return true;
            }
        }
        return false;
    }

    public static void replace(char oChar) {
        for (int i = 0; i < answer.length; i++) {
            if (answer[i] == oChar) {
                dispString[i] = oChar;
            }
        }
    }

    public static void readFile(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String s = "";
        while ((s = br.readLine()) != null) {
            System.out.println(s);
        }
    }


    public static void initialize() throws IOException {
        findRandString();
        dispString = new char[answer.length];
        Arrays.fill(dispString, '_');
        for (char oChar : answer) {
            uniqueCharacters.add(oChar);
        }
    }

    public static void findRandString() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("wordlist.in"));

        //@todo calculate number of words in list
        int numWords = 0;
        String inp;
        while ((inp = br.readLine()) != null) {
            numWords++;
        }
        numWords--;

        //@todo random number for string
        Random r = new Random();
        int rand = r.nextInt((numWords) + 1);

        //@todo Find the random string
        String ans = "";
        br = new BufferedReader(new FileReader("wordlist.in"));
        for (int i = 0; i <= rand; i++) {
            ans = br.readLine();
        }
        answer = ans.toCharArray();
    }


}

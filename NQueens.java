import java.io.*;
import java.util.Arrays;

public class NQueens {
    private static int N;
    private static int[][] occupied = new int[100][100];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("nQueens.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("nQueens.out")));
        N = Integer.parseInt(br.readLine());
        nQueen(N);
        //printing the matix
        for (int row = 0; row < N; row++) {
            for (int column = 0; column < N; column++)
                pw.print(occupied[row][column] + " ");
            pw.println();
        }
        pw.close();
    }

    private static boolean nQueen(int queens) {

        if (queens == 0)
            //No more queens
            return true;
        for (int row = 0; row < N; row++) {
            for (int column = 0; column < N; column++) {
                if ((!isAttack(row, column)) && (occupied[row][column] != 1)) {
                    // If no one is attacking this cell, and no one has occupied this cell, put the queen in this cell
                    occupied[row][column] = 1;

                    if (nQueen(queens - 1)) {
                        return true;
                    }
                    occupied[row][column] = 0;
                }
            }
        }
        return false;
    }

    public static void printMatrix(int[][] matrix) {
        Arrays.stream(matrix).forEach(
                (row) -> {
                    System.out.print("[");
                    Arrays.stream(row)
                            .forEach((el) -> System.out.print(" " + el + " "));
                    System.out.println("]");
                });
    }

    private static boolean isAttack(int row, int column) {
        int l;

        for (int newPos = 0; newPos < N; newPos++) {
            if ((occupied[row][newPos] == 1) || (occupied[newPos][column] == 1))
                return true;
        }

        for (int k = 0; k < N; k++) {
            for (l = 0; l < N; l++) {
                if (((k + l) == (row + column)) || ((k - l) == (row - column))) {
                    if (occupied[k][l] == 1)
                        return true;
                }
            }
        }
        return false;
    }
}

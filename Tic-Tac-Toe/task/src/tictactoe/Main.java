package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char[][] fieldState;
        Scanner stdin = new Scanner(System.in);

        fieldState = readFieldState(stdin);
        System.out.println(formatFieldState(fieldState));
    }

    private static String formatFieldState(char[][] fieldState) {
        StringBuilder ret = new StringBuilder();
        ret.append("---------\n");
        for (int i = 0; i < 3; i++) {
            ret.append("| ");
            for (int j = 0; j < 3; j++) {
                ret.append(fieldState[i][j]).append(" ");
            }
            ret.append("|\n");
        }
        ret.append("---------\n");
        return ret.toString();
    }

    private static char[][] readFieldState(Scanner in) {
        char[][] ret = new char[3][3];
        String str = in.next();
        int k = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ret[i][j] = str.charAt(k);
                k++;
            }
        }
        return ret;
    }
}

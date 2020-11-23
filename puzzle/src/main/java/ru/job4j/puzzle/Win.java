package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        int rightNum = 1;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == rightNum) {
                if (horizontal(board, i) || vertical(board, i)) {
                    rsl = true;
                    break;
                }
            }
        }
        return rsl;
    }

    public static boolean horizontal(int[][] board, int row) {
        boolean rsl = true;
        int rightNum = 1;
        for (int i = 0; i < board.length; i++) {
                if (board[row][i] != rightNum) {
                    rsl = false;
                    break;
                }
        }
        return rsl;
    }

    public static boolean vertical(int[][] board, int column) {
        boolean rsl = true;
        int rightNum = 1;
        for (int i = 0; i < board.length; i++) {
                if (board[i][column] != rightNum) {
                    rsl = false;
                    break;
                }
        }
        return rsl;
    }
}

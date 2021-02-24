package Assignment3;

import java.util.Scanner;

public class Nqueens {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		boolean[][] board = new boolean[n][n];

		printNQueens(board, 0, "");
		System.out.println();
		System.out.println(countNQueens(board, 0));
		

	}

	public static int countNQueens(boolean[][] board, int row) {
		if (row == board.length) {

			return 1;
		}
		int count = 0;
		for (int col = 0; col < board[row].length; col++) {
			if (isItSafe(board, row, col)) {
				board[row][col] = true;
				count = count + countNQueens(board, row + 1);
				board[row][col] = false;

			}
		}
		return count;

	}

	public static void printNQueens(boolean[][] board, int row, String result) {
		if (row == board.length) {
			System.out.print(result);
			return;
		}

		for (int col = 0; col < board[row].length; col++) {
			if (isItSafe(board, row, col)) {
				board[row][col] = true;
				printNQueens(board, row + 1, result + "{" + (row + 1) + "-" + (col + 1) + "}"+'\t');
				board[row][col] = false;

			}
		}

	}

	private static boolean isItSafe(boolean[][] board, int row, int col) {
		for (int i = row; i >= 0; i--) {
			if (board[i][col]) {
				return false;
			}
		}
		for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
			if (board[i][j]) {
				return false;
			}
		}
		for (int i = row, j = col; i >= 0 && j < board.length; i--, j++) {
			if (board[i][j]) {
				return false;
			}
		}
		return true;
	}

}

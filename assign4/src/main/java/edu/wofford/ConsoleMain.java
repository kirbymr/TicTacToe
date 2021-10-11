package edu.wofford;

import java.util.Scanner;

public class ConsoleMain {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		char[][] gameBoard = {
			{'_','|','_','|','_'},
      		{'_','|','_','|','_'},
      		{' ','|',' ','|',' '}
		};

		printBoard(gameBoard);

		playerMove(gameBoard);

		isGameOver(gameBoard);


		// ask player what position they would like to move to, save response, feed it into updateBoard()
		public static void playerMove(char[][] gameBoard) {
			System.out.println("Please make a move. (1-9)");
			int move = keyboard.nextInt();
			boolean result = isValidMove(move, gameBoard);

			while (!result) {
				System.out.println("Invalid move.");
				move = keyboard.nextInt();
				result = isValidMove(move, gameboard);
			}
			updateBoard(move, 1, gameBoard);
		}



		public static boolean isValidMove(int move, char[][] gameBoard) {
			switch(move) {
				case 1:
					if (gameBoard[0][0] == "-") {
						return true;
					} else {
						return false;
					}
				case 2:
					if (gameBoard[0][2] == "-") {
						return true;
					} else {
						return false;
					}
				case 3:
					if (gameBoard[0][4] == "-") {
						return true;
					} else {
						return false;
					}
				case 4:
					if (gameBoard[1][0] == "-") {
						return true;
					} else {
						return false;
					}
				case 5:
					if (gameBoard[1][2] == "-") {
						return true;
					} else {
						return false;
					}
				case 6:
					if (gameBoard[1][4] == "-") {
						return true;
					} else {
						return false;
					}
				case 7:
					if (gameBoard[2][0] == "-") {
						return true;
					} else {
						return false;
					}
				case 8:
					if (gameBoard[2][2] == "-") {
						return true;
					} else {
						return false;
					}
				case 9:
					if (gameBoard[2][4] == "-") {
						return true;
					} else {
						return false;
					}
				default:
					return false;
			}
		}



	}
}
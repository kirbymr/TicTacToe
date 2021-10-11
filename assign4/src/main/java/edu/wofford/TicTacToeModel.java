package edu.wofford;
import java.util.Scanner;


public class TicTacToeModel {
    protected char[][] gameBoard = {
      {' ','|',' ','|',' '},
      {'_','_','_','_','_'},
      {' ','|',' ','|',' '},
      {'_','_','_','_','_'},
      {' ','|',' ','|',' '},
    };
    protected int player = 1;
    private int XorO = 1;

    // takes in a 2D array and prints the array contents to the console
    // for each character within the row, print the character out
    public static void printBoard(char [][] gameBoard){
        for (int row = 0; row < gameBoard.length; row++) {
            for (int c = 0; c < gameBoard[0].length; c++) {
                System.out.println(gameBoard[row][c]);
            }
            System.out.println();
        }
    }

    // takes in location in which the piece will be placed, whose turn it is, and state of gameBoard (found online)
    // makes sense for one player but unsure how to do with two
    public static void updateBoard(int position, int player, char[][] gameBoard) {
        char character;

        if (player == "X") {
            character = "O";
        } else {
            character = "X";
        }

        switch(position) {
            case 1:
                gameBoard[0][0] = character;
                printBoard(gameBoard);
                break;
            case 2:
                gameBoard[0][2] = character;
                printBoard(gameBoard);
                break;
            case 3:
                gameBoard[0][4] = character;
                printBoard(gameBoard);
                break;
            case 4:
                gameBoard[1][0] = character;
                printBoard(gameBoard);
                break;
            case 5:
                gameBoard[1][2] = character;
                printBoard(gameBoard);
                break;
            case 6:
                gameBoard[1][4] = character;
                printBoard(gameBoard);
                break;
            case 7:
                gameBoard[2][0] = character;
                printBoard(gameBoard);
                break;
            case 8:
                gameBoard[2][2] = character;
                printBoard(gameBoard);
                break;
            case 9:
                gameBoard[2][4] = character;
                printBoard(gameBoard);
                break;

            default:
                break;
        }
    }

    public static void resetBoard(char [][] gameBoard) {

        gameBoard[0][0] = '_';
        gameBoard[0][2] = '_';
        gameBoard[0][4] = '_';
        gameBoard[1][0] = '_';
        gameBoard[1][2] = '_';
        gameBoard[1][4] = '_';
        gameBoard[2][0] = ' ';
        gameBoard[2][2] = ' ';
        gameBoard[2][4] = ' ';
    }


    public static boolean isGameOver(char [][] gameboard) {
        if (gameboard[0][0] == 'X'&& gameboard[0][2] == 'X' && gameboard [0][4] == 'X' ) {
            System.out.println("Player X Wins");
            return true;
        }
        if (gameboard[0][0] == 'O'&& gameboard[0][2] == 'O' && gameboard [0][4] == 'O' ) {
            System.out.println("player O Wins");
            return true;
        }
        if (gameboard[1][0] == 'X'&& gameboard[1][2] == 'X' && gameboard [1][4] == 'X' ) {
            System.out.println("Player X Wins");
            return true;
        }
        if (gameboard[1][0] == 'O'&& gameboard[1][2] == 'O' && gameboard [1][4] == 'O' ) {
            System.out.println("Player O Wins");
            return true;
        }
        if (gameboard[2][0] == 'X'&& gameboard[2][2] == 'X' && gameboard [2][4] == 'X' ) {
            System.out.println("Player X Wins");
            return true;
        }
        if (gameboard[2][0] == 'O'&& gameboard[2][2] == 'O' && gameboard [2][4] == 'O' ) {
            System.out.println("Player O Wins");
            return true;
        }


        if (gameboard[0][0] == 'X'&& gameboard[1][0] == 'X' && gameboard [2][0] == 'X' ) {
            System.out.println("Player X Wins");
            return true;
        }
        if (gameboard[0][0] == 'O'&& gameboard[1][0] == 'O' && gameboard [2][0] == 'O' ) {
            System.out.println("player O Wins");
            return true;
        }
        if (gameboard[0][2] == 'X'&& gameboard[1][2] == 'X' && gameboard [2][2] == 'X' ) {
            System.out.println("Player X Wins");
            return true;
        }
        if (gameboard[0][2] == 'O'&& gameboard[1][2] == 'O' && gameboard [2][2] == 'O' ) {
            System.out.println("Player O Wins");
            return true;
        }
        if (gameboard[0][4] == 'X'&& gameboard[1][4] == 'X' && gameboard [2][4] == 'X' ) {
            System.out.println("Player X Wins");
            return true;
        }
        if (gameboard[0][4] == 'O'&& gameboard[1][4] == 'O' && gameboard [2][4] == 'O' ) {
            System.out.println("Player O Wins");
            return true;
        }


        if (gameboard[0][0] == 'X'&& gameboard[1][2] == 'X' && gameboard [2][4] == 'X' ) {
            System.out.println("Player X Wins");
            return true;
        }
        if (gameboard[0][0] == 'O'&& gameboard[1][2] == 'O' && gameboard [2][4] == 'O' ) {
            System.out.println("player O Wins");
            return true;
        }
        if (gameboard[2][0] == 'X'&& gameboard[1][2] == 'X' && gameboard [0][4] == 'X' ) {
            System.out.println("Player X Wins");
            return true;
        }
        if (gameboard[2][0] == 'O'&& gameboard[1][2] == 'O' && gameboard [0][4] == 'O' ) {
            System.out.println("Player O Wins");
            return true;
        }

        if(gameboard[0][0] != '_' && gameboard[0][2] != '_' && gameboard[0][4] != '_' && gameboard[1][0] !='_'&&
        gameboard[1][2] != '_' && gameboard[1][4] != '_' && gameboard[2][0] != ' ' && gameboard[2][2] != ' ' && gameboard[2][4] != ' ') {
            System.out.println("Its a tie");
            return true;
        }


        
    }

    

    



    
}


//this is abstraction of the game
//track the game
//create the actual logic of the game rather than what it looks like
import java.util.Scanner;

// This is where the game actually runs, and players interact with it.
public class TicTacToeApplication { // main class
    public static void main(String[] args) { // main method
        Scanner input = new Scanner(System.in); // scanner object

        
        System.out.println("You are playing Tic Tac Toe"); // print statement that informs the players which game they are playing
        System.out.print("Player X, please type yes to go first, no to not go first: "); // asks player x if they want to
        boolean firstPlayerIsX = input.nextLine().contains("yes"); // makes the player x choose if he or she wants to go first, plus learned .contains method in class and about next line through this website and link as mentioned in Assignment 4 // learned about nextLine from https://stackoverflow.com/questions/48702108/print-entire-line-string-with-java-scanner

        TicTacToe ticTacToeGame = new TicTacToe(firstPlayerIsX); // intializes

        
        while (true) { // loop
            ticTacToeGame.currentBoardPrinted(); // displays the updated board after each move
            System.out.println("Player " + ticTacToeGame.getPlayerCurrentlyPlaying().getPossibileOptionsTicTacToe() + "'s turn:"); // helps in letting the player know it's their turn

            
            System.out.print("Enter a row between 0 and 2:"); // asks player what choice or move they like to make depending on the row
            int rows = input.nextInt(); // updates the row depending on what each player types in everytime
            System.out.print("Enter a column between 0 and 2:"); // asks player what choice or move they like to make depending on the column
            int columns = input.nextInt();  // updates the column depending on what each player types in everytime

            
            if (ticTacToeGame.makeYourMove(rows, columns)) { 
                if (ticTacToeGame.checkIfWon()) { // used to check if the if the current player has won or not
                    ticTacToeGame.currentBoardPrinted(); // displays the tic tac toe board with the final result if either player X or O has won
                    System.out.println("Player " + ticTacToeGame.getPlayerCurrentlyPlaying().getPossibileOptionsTicTacToe() + " wins!"); // prints who wins
                    break; // the game ends through break if the a player has won
                } else if (ticTacToeGame.ifDraw()) { // checks if its a draw
                    ticTacToeGame.currentBoardPrinted(); // displays the current board
                    System.out.println("The game is a draw"); // helps the player now they won
                    break;
                } else {
                    ticTacToeGame.playerSwitch(); // If no one has won yet, next player such as player x or o takes their turn
                }
            }
        }
    }
}
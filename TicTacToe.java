public class TicTacToe {
    private TicTacToeValues[][] ticTacToeBoard = new TicTacToeValues[3][3]; // helps in creating a 3x3 grid
    private TicTacToeValues playerCurrentlyPlaying; // as the name suggests, we get to know who is playing currently

    // When I create a new game, I ask if X should go first.
    public TicTacToe(boolean playerXStarts) {
        playerCurrentlyPlaying = playerXStarts ? TicTacToeValues.X : TicTacToeValues.O;
        boardIntialized(); // calls boardIntialized
    }

    
    private void boardIntialized() { // method to intialize values with empty spaces
        for (int i = 0; i < 3; i++) { // for loop
            for (int x = 0; x < 3; x++) { // for loop 
                ticTacToeBoard[i][x] = TicTacToeValues.EMPTY;
            }
        }
    }

    
    public boolean makeYourMove(int rows, int columns) { 
        if (rows < 0 || rows > 2 || columns < 0 || columns > 2) { // checks if the players move is out of bounds
            System.out.println("Your move was out of bounds, try again if you want to."); // print statement
            return false;
        }
        // Then I check if the cell is already taken.
        if (ticTacToeBoard[rows][columns] != TicTacToeValues.EMPTY) { // checks if the cell or the option has already been taken by the other player
            System.out.println("The following option/cell was already taken."); // print statement
            return false;
        }

        
        ticTacToeBoard[rows][columns] = playerCurrentlyPlaying; // if the players move is correct, the cell or option is assignned through next line
        return true;
    }

    
    public void playerSwitch() { // method to move to next player which is either player X or O
        playerCurrentlyPlaying= (playerCurrentlyPlaying == TicTacToeValues.X) ? TicTacToeValues.O : TicTacToeValues.X;
    }

    // This helps me know whose turn it is.
    public TicTacToeValues getPlayerCurrentlyPlaying() { // current player
        return playerCurrentlyPlaying; 
    }

    // This method checks if the current player has won the game.
    public boolean checkIfWon() {
        // I check all rows and columns.
        for (int i = 0; i < 3; i++) {
            if (ticTacToeBoard[i][0] != TicTacToeValues.EMPTY && // each line checks if a player has won 
                ticTacToeBoard[i][0] == ticTacToeBoard[i][1] && // each line checks if a player has won
                ticTacToeBoard[i][1] == ticTacToeBoard[i][2])  // each line checks if a player has won
            return true;

            if (ticTacToeBoard[0][i] != TicTacToeValues.EMPTY && // each line checks if a player has won
                ticTacToeBoard[0][i] == ticTacToeBoard[1][i] && // each line checks if a player has won
                ticTacToeBoard[1][i] == ticTacToeBoard[2][i])  // each line checks if a player has won
            return true;
        }

        // Then I check both diagonals.
        if (ticTacToeBoard[0][0] != TicTacToeValues.EMPTY && // each line checks if a player has won
            ticTacToeBoard[0][0] == ticTacToeBoard[1][1] && // each line checks if a player has won 
            ticTacToeBoard[1][1] == ticTacToeBoard[2][2])  // each line checks if a player has won 
        return true;

        if (ticTacToeBoard[0][2] != TicTacToeValues.EMPTY && // each line checks if a player has won
            ticTacToeBoard[0][2] == ticTacToeBoard[1][1] && // each line checks if a player has won
            ticTacToeBoard[1][1] == ticTacToeBoard[2][0])  // each line checks if a player has won
        return true;  

        return false;
    }

    
    public boolean ifDraw() { // method checks whether the tic tac toe board is full
        for (TicTacToeValues[] rows : ticTacToeBoard) { // for loop
            for (TicTacToeValues cell : rows) { // inner for loop
                if (cell == TicTacToeValues.EMPTY) // conditional statement
                    return false; 
            }
        }
        return checkIfWon() == false; // If board is full and nobody won, then it's a draw.
    }

    

     public void currentBoardPrinted() { // method to print the updated board
        System.out.println(" Tic Tac Toe Board:"); // print statement
        for (int i = 0; i < 3; i++) { // for loop
            System.out.println(" " + ticTacToeBoard[i][0].getPossibileOptionsTicTacToe() + "  |  " + ticTacToeBoard[i][1].getPossibileOptionsTicTacToe() + "  |  " + ticTacToeBoard[i][2].getPossibileOptionsTicTacToe());
            if (i < 2) { // conditional statement
                System.out.println("________________"); // print statement
            }
        }
    }
}
// I created an enum to represent the possible values of a Tic-Tac-Toe cell.
public enum TicTacToeValues {
    X("X"), // X as a possible value for the tic tac toe board
    O("O"), // O as a possible value for the tic tac toe board 
    EMPTY(" "); // nothing but just a space as a possible value

      
    private final String PossibileOptionsTicTacToe; // helps in storing the possible values

    
    TicTacToeValues(String PossibileOptionsTicTacToe) { // serves as a constructor
        this.PossibileOptionsTicTacToe = PossibileOptionsTicTacToe;
    }

    
    public String getPossibileOptionsTicTacToe() { // get method to get either X, O or " " as
        return PossibileOptionsTicTacToe;
    }
}
Tic-Tac-Toe | Java Console Game

A two-player Tic-Tac-Toe game built in Java that runs directly in the terminal. Players take turns placing X and O on a 3×3 board, with automatic checks for valid moves, wins, and draws.

This project demonstrates core object-oriented programming concepts in Java, including classes, enums, encapsulation, methods, conditional logic, loops, and two-dimensional arrays.

Features

- Local two-player gameplay: two people play on the same terminal, alternating between X and O.

- Choice of starting player: Player X can choose whether to make the first move.

- Interactive board: displays the current board before each turn and the final board at the end.

- Move validation: rejects coordinates outside the board or positions that are already occupied without switching turns.

- Automatic win detection: checks all three rows, all three columns, and both diagonals.

- Draw detection: ends the game when the board is full and neither player has won.

Requirements

- Java Development Kit (JDK) installed, with javac and java available in your terminal.

- No additional libraries or frameworks are required.

1. Compile the source files:
   
javac TicTacToeValues.java TicTacToe.java TicTacToeApplication.java

2. Run the game:

java TicTacToeApplication


package squier.john.gameof15;

/**
 * Created by johnsquier on 1/22/17.
 */
public class GameLoop {

    private GameOf15Board gameOf15Board;
    private View view;

    public GameLoop() {
        gameOf15Board = new GameOf15Board();
        view = new View(gameOf15Board);
    }

    public void run() {

        boolean theGameIsRunning = true; // set to false when win condition met

        while ( theGameIsRunning ) {


            view.displayIntroScreen();

            theGameIsRunning = false;
            //view.displayTheBoard();
        }
    }

    public static void main(String[] args) {
        GameLoop gameLoop = new GameLoop();
        gameLoop.run();
    }



    // get game board size // lets only do 15 to start
    // check if it's in range // only doing 15

    // intro screen

    // initialize the board, randomize option

    // game loop
        // clear screen
        // draw board in current state
        // check for win and break out of game loop
        // prompt for move
        // if ( !move (inputTile) ) { /* runs if a move is not possible */ }
            // move updates board state and returns a boolean takes an int arg

    // display victory screen


    // classes: board, io, game(loop)

    // board stores state and handles moves.
    // io prompts user for moves and gets moves as well as displays the board.
    // game / gameloop handles the loop that runs over and over until
        // a victory state of the board is reached.
}

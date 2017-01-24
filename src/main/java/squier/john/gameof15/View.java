package squier.john.gameof15;

/**
 * Created by johnsquier on 1/23/17.
 */
public class View {

    private GameOf15Board gameOf15Board;

    public View(GameOf15Board gameOf15Board) {
        this.gameOf15Board = gameOf15Board;
    }

    public void displayIntroScreen() {
        System.out.println("WELCOME TO THE GAME OF 15");
        System.out.println("This board is "
                            + (gameOf15Board.getIsBoardRandomizedAtStart() ?
                                "" : "not ")
                            + "randomized");
    }
}

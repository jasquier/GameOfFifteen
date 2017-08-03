package com.scoutItOut.gameOfFifteen.gameOfFifteen.model;

/**
 * @author jasquier
 * @since 0.1
 *
 * Class to represent a cell in the Game of Fifteen.
 */
public class Cell {

    private int value;

    public Cell(int value) {
        this.value = value;
    }

    int getValue() {
        return value;
    }

    // TODO implement upper and lower limits for value in this setter (1 - 15)
    void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }

    @Override
    public boolean equals(Object other) {
        return other instanceof Cell && this.equals((Cell) other);
    }

    private boolean equals(Cell other) {
        return this.getValue() == other.getValue();
    }
}

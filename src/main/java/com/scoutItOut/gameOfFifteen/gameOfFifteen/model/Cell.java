package com.scoutItOut.gameOfFifteen.gameOfFifteen.model;

/**
 * @author jasquier
 * @since 0.1
 */
public class Cell {

    private int value;

    public Cell(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }
}

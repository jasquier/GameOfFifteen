package com.scoutItOut.gameOfFifteen.exceptions;

public class CellValueOutOfRange extends RuntimeException {

    public CellValueOutOfRange() {
        super();
    }

    public CellValueOutOfRange(String message) {
        super(message);
    }
}

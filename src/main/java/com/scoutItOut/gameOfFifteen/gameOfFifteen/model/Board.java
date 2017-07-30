package com.scoutItOut.gameOfFifteen.gameOfFifteen.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Board {

    @Autowired
    private Cell[][] cells;

    public Board(Cell[][] cells) {
        this.cells = cells;
    }


}

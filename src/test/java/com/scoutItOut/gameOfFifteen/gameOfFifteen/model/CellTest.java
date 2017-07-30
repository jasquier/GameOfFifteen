package com.scoutItOut.gameOfFifteen.gameOfFifteen.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class CellTest {

    @Test
    public void toStringShouldPrintTheCellsValue() {
        Cell cell = new Cell(1);

        assertEquals(cell.toString(), "1");
    }
}

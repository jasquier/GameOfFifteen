package com.scoutItOut.gameOfFifteen.model;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

/**
 * @author jasquier
 * @since v0.1
 */
public class CellTest {

    @Test
    public void setterAndGetterShouldWorkProperly() {
        Cell cell = new Cell(1);
        cell.setValue(2);
        int cellValue = cell.getValue();

        assertThat(cellValue, is(2));
    }

    @Test
    public void toStringShouldPrintTheCellsValue() {
        Cell cell = new Cell(1);

        assertThat(cell.toString(), is("1"));
    }

    @Test
    public void twoCellsWithTheSameValueShouldBeEqual() {
        Cell aCell = new Cell(1);
        Cell anotherCell = new Cell(1);

        assertThat(aCell, is(anotherCell));
    }

    @Test
    public void twoCellsWithDifferentValuesShouldNotBeEqual() {
        Cell cell1 = new Cell(1);
        Cell cell2 = new Cell(2);

        assertThat(cell1, is(not(cell2)));
    }

    @Test
    public void aCellShouldNotEqualAString() {
        String aString = "aString";
        Cell aCell = new Cell(1);

        assertThat(aCell, is(not(aString)));
    }
}

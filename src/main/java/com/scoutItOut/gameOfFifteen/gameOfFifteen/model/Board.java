package com.scoutItOut.gameOfFifteen.gameOfFifteen.model;

import com.scoutItOut.gameOfFifteen.gameOfFifteen.dao.BoardDAO;

/**
 * @author jasquier
 * @since 0.1
 *
 * We are currently treating i as y and j as x in a Cartesian plane.
 *         /\
 * i=3,j=0 |
 *         |
 *         |
 *         |
 *         |
 *         |
 *         -------------------------------->
 *         i=0,j=0                 i=0,j=3
 */
public class Board {

    private Long id;
    private Cell[][] cells;

    public Board() {
        cells = populateBoardFrom();
    }

    public Board(BoardDAO boardDAO) {
        cells = populateBoardFrom(boardDAO);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cell[][] getCells() {
        return cells;
    }

    @Override
    public boolean equals(Object other) {
        if ( other instanceof Board ) {
            return this.equals((Board)other);
        } else {
            return false;
        }
    }

    // TODO needs testing convertBoardToDAO()
    public BoardDAO convertBoardToDAO() {
        BoardDAO boardDAO = new BoardDAO();

        boardDAO.setId(1L);

        boardDAO.setCell00Value(cells[0][0].getValue());
        boardDAO.setCell01Value(cells[0][1].getValue());
        boardDAO.setCell02Value(cells[0][2].getValue());
        boardDAO.setCell03Value(cells[0][3].getValue());

        boardDAO.setCell10Value(cells[1][0].getValue());
        boardDAO.setCell11Value(cells[1][1].getValue());
        boardDAO.setCell12Value(cells[1][2].getValue());
        boardDAO.setCell13Value(cells[1][3].getValue());

        boardDAO.setCell20Value(cells[2][0].getValue());
        boardDAO.setCell21Value(cells[2][1].getValue());
        boardDAO.setCell22Value(cells[2][2].getValue());
        boardDAO.setCell23Value(cells[2][3].getValue());

        boardDAO.setCell30Value(cells[3][0].getValue());
        boardDAO.setCell31Value(cells[3][1].getValue());
        boardDAO.setCell32Value(cells[3][2].getValue());
        boardDAO.setCell33Value(cells[3][3].getValue());

        return boardDAO;
    }

    // note we are reserving the long 1L for the default boards' id
    // populate the board with default values
    private Cell[][] populateBoardFrom() {
        this.id = 1l;
        Cell[] row3 = {new Cell(15), new Cell(14), new Cell(13), new Cell(12)};
        Cell[] row2 = {new Cell(11), new Cell(10), new Cell(9), new Cell(8)};
        Cell[] row1 = {new Cell(7), new Cell(6), new Cell(5), new Cell(4)};
        Cell[] row0 = {new Cell(3), new Cell(2), new Cell(1), new Cell(0)};
        Cell[][] allRows = {row0, row1, row2, row3};
        return allRows;
    }

    // populate the board with values from the given DAO
    private Cell[][] populateBoardFrom(BoardDAO boardDAO) {
        this.id = boardDAO.getId();

        Cell[][] temp = new Cell[4][4];
        temp[0][0] = new Cell(boardDAO.getCell00Value());
        temp[0][1] = new Cell(boardDAO.getCell01Value());
        temp[0][2] = new Cell(boardDAO.getCell02Value());
        temp[0][3] = new Cell(boardDAO.getCell03Value());

        temp[1][0] = new Cell(boardDAO.getCell10Value());
        temp[1][1] = new Cell(boardDAO.getCell11Value());
        temp[1][2] = new Cell(boardDAO.getCell12Value());
        temp[1][3] = new Cell(boardDAO.getCell13Value());

        temp[2][0] = new Cell(boardDAO.getCell20Value());
        temp[2][1] = new Cell(boardDAO.getCell21Value());
        temp[2][2] = new Cell(boardDAO.getCell22Value());
        temp[2][3] = new Cell(boardDAO.getCell23Value());

        temp[3][0] = new Cell(boardDAO.getCell30Value());
        temp[3][1] = new Cell(boardDAO.getCell31Value());
        temp[3][2] = new Cell(boardDAO.getCell32Value());
        temp[3][3] = new Cell(boardDAO.getCell33Value());

        return temp;
    }

    // TODO complete equals method to compare cells
    private boolean equals(Board other) {
        boolean flag = false;
        if ( thisBoardsIdMatches(other) ) {
            flag = true;
        }
        return flag;
    }

    private boolean thisBoardsIdMatches(Board other) {
        return this.getId().equals(other.getId());
    }
}

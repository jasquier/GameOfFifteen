package com.scoutItOut.gameOfFifteen.gameOfFifteen.controllers;

import com.scoutItOut.gameOfFifteen.gameOfFifteen.model.Board;
import com.scoutItOut.gameOfFifteen.gameOfFifteen.repository.BoardRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author jasquier
 * @since 0.1
 */
@CrossOrigin
@RestController
@RequestMapping(value = "api/v0.1/")
public class BoardController {

    @Autowired
    private BoardRepository boardRepository;

    @RequestMapping(value = "board", method = RequestMethod.GET)
    public Board exampleBoard() {
        return new Board(1L, "exampleBoard");
    }

    @RequestMapping(value = "boards", method = RequestMethod.GET)
    public List<Board> list() {
        return boardRepository.findAll();
    }

    @RequestMapping(value = "boards", method = RequestMethod.POST)
    public Board create(@RequestBody Board board) {
        return boardRepository.saveAndFlush(board);
    }

    @RequestMapping(value = "boards/{id}", method = RequestMethod.GET)
    public Board get(@PathVariable Long id) {
        return boardRepository.findOne(id);
    }

    @RequestMapping(value = "boards/{id}", method = RequestMethod.PUT)
    public Board update(@PathVariable Long id, @RequestBody Board board) {
        Board existingBoard = boardRepository.findOne(id);
        BeanUtils.copyProperties(board, existingBoard);
        return boardRepository.saveAndFlush(existingBoard);
    }

    @RequestMapping(value = "boards/{id}", method = RequestMethod.DELETE)
    public Board delete(@PathVariable Long id) {
        Board existingBoard = boardRepository.findOne(id);
        boardRepository.delete(existingBoard);
        return existingBoard;
    }
}

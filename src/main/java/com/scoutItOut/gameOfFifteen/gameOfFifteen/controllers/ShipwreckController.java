package com.scoutItOut.gameOfFifteen.gameOfFifteen.controllers;

import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.scoutItOut.gameOfFifteen.gameOfFifteen.model.Board;
import com.scoutItOut.gameOfFifteen.gameOfFifteen.repository.BoardRepository;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/")
public class ShipwreckController {

    @Autowired
    private BoardRepository boardRepository;

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

package com.scoutItOut.gameOfFifteen.controllers;

import com.scoutItOut.gameOfFifteen.dao.BoardDAO;
import com.scoutItOut.gameOfFifteen.model.Board;
import com.scoutItOut.gameOfFifteen.repository.BoardRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author jasquier
 * @since 0.1
 *
 * Our app is not a crud application so the front end wont be able to issue commands through the middle like this
 * Note that we are using BoardDAO's to interact with the backend and should probably not be using them to talk to the front.
 *
 * Should we use constructor based dependency injection??
 */
@CrossOrigin
@RestController
@RequestMapping(value = "api/v0.1/")
public class BoardController {

    @Autowired
    private BoardRepository boardRepository;

    @RequestMapping(value = "board", method = RequestMethod.GET)
    public BoardDAO exampleBoard() {
        return new Board().convertBoardToDAO();
    }

    @RequestMapping(value = "boards", method = RequestMethod.GET)
    public List<BoardDAO> list() {
        return boardRepository.findAll();
    }

    @RequestMapping(value = "boards", method = RequestMethod.POST)
    public BoardDAO create(@RequestBody BoardDAO boardDAO) {
        return boardRepository.saveAndFlush(boardDAO);
    }

    @RequestMapping(value = "boards/{id}", method = RequestMethod.GET)
    public BoardDAO get(@PathVariable Long id) {
        return boardRepository.findOne(id);
    }

    @RequestMapping(value = "boards/{id}", method = RequestMethod.PUT)
    public BoardDAO update(@PathVariable Long id, @RequestBody BoardDAO boardDAO) {
        BoardDAO existingBoard = boardRepository.findOne(id);
        BeanUtils.copyProperties(boardDAO, existingBoard);
        return boardRepository.saveAndFlush(existingBoard);
    }

    @RequestMapping(value = "boards/{id}", method = RequestMethod.DELETE)
    public BoardDAO delete(@PathVariable Long id) {
        BoardDAO existingBoard = boardRepository.findOne(id);
        boardRepository.delete(existingBoard);
        return existingBoard;
    }
}

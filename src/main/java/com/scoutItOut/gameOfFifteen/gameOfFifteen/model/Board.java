package com.scoutItOut.gameOfFifteen.gameOfFifteen.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String name;

    public Board() {

    }

    public Board(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*
    @Autowired
    private Cell[][] cells;

    public Board(Cell[][] cells) {
        this.cells = cells;
    }
    */

}

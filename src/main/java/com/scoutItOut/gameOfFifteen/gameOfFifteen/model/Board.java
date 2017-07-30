package com.scoutItOut.gameOfFifteen.gameOfFifteen.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author jasquier
 * @since 0.1
 *
 */
@Entity
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Cell[] cells;

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

    @Override
    public boolean equals(Object other) {
        if ( other instanceof Board ) {
            return this.equals((Board)other);
        } else {
            return false;
        }
    }

    private boolean equals(Board other) {
        boolean flag = false;
        if ( thisBoardsIdMatches(other) ) {
            if( thisBoardsNameMatches(other) ) {
                flag = true;
            }
        }
        return flag;
    }

    private boolean thisBoardsIdMatches(Board other) {
        return this.getId().equals(other.getId());
    }

    private boolean thisBoardsNameMatches(Board other) {
        return this.getName().equals(other.getName());
    }
}

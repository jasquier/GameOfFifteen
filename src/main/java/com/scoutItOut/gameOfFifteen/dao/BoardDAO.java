package com.scoutItOut.gameOfFifteen.dao;

import javax.persistence.*;

/**
 * @author jasquier
 * @since 0.1
 *
 * The entire conversion from Board to BoardDAO is needed so we can store simple ints in the
 *  DB instead of the 2d array we are using to represent the board internally
 */
@Entity
public class BoardDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int cell00Value;
    private int cell01Value;
    private int cell02Value;
    private int cell03Value;
    private int cell10Value;
    private int cell11Value;
    private int cell12Value;
    private int cell13Value;
    private int cell20Value;
    private int cell21Value;
    private int cell22Value;
    private int cell23Value;
    private int cell30Value;
    private int cell31Value;
    private int cell32Value;
    private int cell33Value;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCell00Value() {
        return cell00Value;
    }

    public void setCell00Value(int cell00Value) {
        this.cell00Value = cell00Value;
    }

    public int getCell01Value() {
        return cell01Value;
    }

    public void setCell01Value(int cell01Value) {
        this.cell01Value = cell01Value;
    }

    public int getCell02Value() {
        return cell02Value;
    }

    public void setCell02Value(int cell02Value) {
        this.cell02Value = cell02Value;
    }

    public int getCell03Value() {
        return cell03Value;
    }

    public void setCell03Value(int cell03Value) {
        this.cell03Value = cell03Value;
    }

    public int getCell10Value() {
        return cell10Value;
    }

    public void setCell10Value(int cell10Value) {
        this.cell10Value = cell10Value;
    }

    public int getCell11Value() {
        return cell11Value;
    }

    public void setCell11Value(int cell11Value) {
        this.cell11Value = cell11Value;
    }

    public int getCell12Value() {
        return cell12Value;
    }

    public void setCell12Value(int cell12Value) {
        this.cell12Value = cell12Value;
    }

    public int getCell13Value() {
        return cell13Value;
    }

    public void setCell13Value(int cell13Value) {
        this.cell13Value = cell13Value;
    }

    public int getCell20Value() {
        return cell20Value;
    }

    public void setCell20Value(int cell20Value) {
        this.cell20Value = cell20Value;
    }

    public int getCell21Value() {
        return cell21Value;
    }

    public void setCell21Value(int cell21Value) {
        this.cell21Value = cell21Value;
    }

    public int getCell22Value() {
        return cell22Value;
    }

    public void setCell22Value(int cell22Value) {
        this.cell22Value = cell22Value;
    }

    public int getCell23Value() {
        return cell23Value;
    }

    public void setCell23Value(int cell23Value) {
        this.cell23Value = cell23Value;
    }

    public int getCell30Value() {
        return cell30Value;
    }

    public void setCell30Value(int cell30Value) {
        this.cell30Value = cell30Value;
    }

    public int getCell31Value() {
        return cell31Value;
    }

    public void setCell31Value(int cell31Value) {
        this.cell31Value = cell31Value;
    }

    public int getCell32Value() {
        return cell32Value;
    }

    public void setCell32Value(int cell32Value) {
        this.cell32Value = cell32Value;
    }

    public int getCell33Value() {
        return cell33Value;
    }

    public void setCell33Value(int cell33Value) {
        this.cell33Value = cell33Value;
    }
}
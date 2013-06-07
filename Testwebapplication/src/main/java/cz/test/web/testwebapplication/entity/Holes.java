/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.test.web.testwebapplication.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Scorpion
 */
@Entity
@Table(name = "HOLES")
public class Holes implements Serializable {

    @GeneratedValue
    @Id
    private int id;
    @Column(name="HOLE1")
    private int one;
    
    @Column(name="HOLE2")
    private int two;
    @Column(name="HOLE3")
    private int three;
    
    @Column(name="HOLE4")
    private int four;
    
    @Column(name="HOLE5")
    private int five;
    
    @Column(name="HOLE6")
    private int six;
    
    @Column(name="HOLE7")
    private int seven;
    
    @Column(name="HOLE8")
    private int eight;
    
    @Column(name="HOLE9")
    private int nine;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public Integer getEight() {
        return eight;
    }

    public void setEight(Integer eight) {
        this.eight = eight;
    }

    public Integer getFive() {
        return five;
    }

    public void setFive(Integer five) {
        this.five = five;
    }

    public Integer getFour() {
        return four;
    }

    public void setFour(Integer four) {
        this.four = four;
    }

    public Integer getNine() {
        return nine;
    }

    public void setNine(Integer nine) {
        this.nine = nine;
    }

    public Integer getOne() {
        return one;
    }

    public void setOne(Integer one) {
        this.one = one;
    }

    public Integer getSeven() {
        return seven;
    }

    public void setSeven(Integer seven) {
        this.seven = seven;
    }

    public Integer getSix() {
        return six;
    }

    public void setSix(Integer six) {
        this.six = six;
    }

    public Integer getThree() {
        return three;
    }

    public void setThree(Integer three) {
        this.three = three;
    }

    public Integer getTwo() {
        return two;
    }

    public void setTwo(Integer two) {
        this.two = two;
    }

  
    public String toString(){
        return null;
    }
}

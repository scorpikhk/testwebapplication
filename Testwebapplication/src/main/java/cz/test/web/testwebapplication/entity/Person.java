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
@Table(name="PERSON")
public class Person implements Serializable {
    
    @GeneratedValue
    @Id
    private Integer id;
    
    
    @Column(name="FIRSTNAME")
    private String firstname;
    
    @Column(name="LASTNAME")
    private String lastname;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
    
    public String toString(){
        return "Person [id="+id+", fistname="+firstname+",lastanem="+ lastname+"]";
    }    
}

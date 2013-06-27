/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.test.web.testwebapplication.dao;

import cz.test.web.testwebapplication.entity.Person;

/**
 *
 * @author Scorpion
 */
public interface PersonDAO {
    
    
    public void addPerson  (Person person); //object class Person
    
    public void editPerson(Person person);
    
    public void deletePerson(Integer id);
    
        
    

}

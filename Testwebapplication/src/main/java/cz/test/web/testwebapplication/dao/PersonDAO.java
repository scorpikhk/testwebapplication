/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.test.web.testwebapplication.dao;

import cz.test.web.testwebapplication.entity.Person;
import java.util.List;

/**
 *
 * @author Scorpion
 */
public interface PersonDAO {
    
    
    public void addPerson  (Person person); //object class Person
    public void editPerson(Person person);
    public Person getPerson(int id);
     public List<Person> getAllPerson();
    public void deletePerson(Integer id);
    
        
    

}

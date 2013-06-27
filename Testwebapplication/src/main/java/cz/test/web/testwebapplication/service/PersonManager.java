/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.test.web.testwebapplication.service;

import cz.test.web.testwebapplication.entity.Person;
import java.util.List;

/**
 *
 * @author Scorpion
 */
public interface PersonManager {
   public void addPerson(Person person);
    public List<Person> getAllPerson();
    public void deletePerson(Integer employeeId); 
}

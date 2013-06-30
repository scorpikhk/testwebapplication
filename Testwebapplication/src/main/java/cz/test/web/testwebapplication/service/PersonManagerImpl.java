/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.test.web.testwebapplication.service;

import cz.test.web.testwebapplication.dao.PersonDAO;
import cz.test.web.testwebapplication.entity.Person;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Scorpion
 */
@Service
public class PersonManagerImpl implements PersonManager{

    
    @Autowired
    PersonDAO personDAO;
    
    @Transactional
    public void addPerson(Person person) {
       personDAO.addPerson(person);
    }

    @Transactional
    public List<Person> getAllPerson() {
       return personDAO.getAllPerson();
    }

    @Transactional
    public void deletePerson(Integer employeeId) {
        personDAO.deletePerson(employeeId);
    }
    
}

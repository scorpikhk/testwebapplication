/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.test.web.testwebapplication.dao;

import cz.test.web.testwebapplication.entity.Person;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Scorpion
 */
public class PersonDAOImpl implements PersonDAO{

    @Autowired
    SessionFactory sessionFactory;       
    
    public void addPerson(Person person) {
        this.sessionFactory.getCurrentSession().save(person);
        
    }

    
    public void editPerson(Person person) {
        
        
    }

    
    public void deletePerson(Integer id) {
        sessionFactory.getCurrentSession().delete(id);
        
    }
    
}

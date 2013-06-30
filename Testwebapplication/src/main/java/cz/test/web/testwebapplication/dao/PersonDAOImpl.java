/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.test.web.testwebapplication.dao;

import cz.test.web.testwebapplication.entity.Person;
import java.util.List;
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
       Person person =getPerson(id);
       if(person==null){
        sessionFactory.getCurrentSession().delete(id);   
       }
        
        
    }

    public Person getPerson(int id) {
       Person person =(Person) sessionFactory.getCurrentSession().get(Person.class, id);
       return person;
    }

    public List<Person> getAllPerson() {
        return this.sessionFactory.getCurrentSession().createQuery("from Person").list();
    }
    
}

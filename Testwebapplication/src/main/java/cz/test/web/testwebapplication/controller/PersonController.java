/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.test.web.testwebapplication.controller;

import cz.test.web.testwebapplication.entity.Person;
import cz.test.web.testwebapplication.service.PersonManager;
import javax.naming.Binding;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Scorpion
 */
@Controller
public class PersonController {
    
    @Autowired
   PersonManager personManager;
  
    @RequestMapping(value="/", method = RequestMethod.GET)
    public String listPerson(ModelMap map ){
        
        map.addAttribute("person", new Person());
       // map.addAttribute("personlist", personManager.getAllPerson());
	
      return "person";
        
   }
   
//    @RequestMapping(value="/addPerson", method = RequestMethod.POST)
//    
//   public String AddPerson(@ModelAttribute (value = "person") Person person,ModelMap model){
//        personManager.addPerson(person);
//        
//        return "person";
//}
   
    
 
}

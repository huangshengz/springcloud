package com.rrg.myboot.controller;

import com.rrg.myboot.bean.Person;
import com.rrg.myboot.servicer.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by huangsz on 2018/6/4 0004
 */
@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping("/savePerson")
    public String savePerson(Person entity){
        personService.save(entity);
        return "保存成功";
    }

    @RequestMapping("/getPersonById")
    public Person getPersonById(int id){
        return personService.getPersonById(id);
    }

    @RequestMapping("/getAll")
    public List<Person> getAll(){
        return personService.queryPerson();
    }
}

package com.rrg.myboot.servicer;

import com.rrg.myboot.bean.Person;
import com.rrg.myboot.dao.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by huangsz on 2018/6/4 0004
 */
@Service
public class PersonService {

    @Autowired
    private PersonDao personDao;

    public int save(Person entity){
        return personDao.save(entity);
    }

    public Person getPersonById(int id){
        return personDao.getById(id);
    }

    public List<Person> queryPerson(){
        return personDao.queryPerson();
    }

    @Transactional
    public void updatePerson(Person entity) throws RuntimeException{
        personDao.update(entity);
    }
}

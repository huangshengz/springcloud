package com.rrg.myboot.servicer;

import com.rrg.myboot.bean.Role;
import com.rrg.myboot.dao.RoleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by huangsz on 2018/6/4 0004
 */
@Service
public class RoleService {

    @Autowired
    private RoleDao roleDao;

    public int save(Role entity){
        return roleDao.save(entity);
    }

    public Role getRoleById(int id){
        return roleDao.getById(id);
    }

    public List<Role> queryPerson(int personId){
        return roleDao.queryRole(personId);
    }
}

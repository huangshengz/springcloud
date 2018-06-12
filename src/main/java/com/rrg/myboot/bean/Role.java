package com.rrg.myboot.bean;

/**
 * Created by huangsz on 2018/6/4 0004
 */
public class Role {

    private int id;

    private String roleName;

    private int personId;

    public int getId() {
        return id;
    }

    public String getRoleName() {
        return roleName;
    }

    public int getPersonId() {
        return personId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }
}

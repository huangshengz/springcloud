package com.rrg.myboot.bean;

import java.util.List;

/**
 * Created by huangsz on 2018/6/4 0004
 */
public class Person {

    private int id;

    private String name;

    private int age;

    private double height;

    private String idCard;

    private int sex;

    private List<Role> role;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public String getIdCard() {
        return idCard;
    }

    public int getSex() {
        return sex;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public List<Role> getRole() {
        return role;
    }

    public void setRole(List<Role> role) {
        this.role = role;
    }
}

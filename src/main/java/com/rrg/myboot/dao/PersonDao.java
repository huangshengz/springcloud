package com.rrg.myboot.dao;

import com.rrg.myboot.bean.Person;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by huangsz on 2018/6/4 0004
 */
@Mapper
public interface PersonDao {

    @Insert("insert into person(name,age,height,sex,id_card) values (" +
            "#{name},#{age},#{height},#{sex},#{idCard})")
    int save(Person entity);

    @Update("update person name=#{name} where id = #{id}")
    int update(Person entity);

    @Delete("delete from person where id = #{id}")
    int detele(int id);

    /*
    我们要使用@Resutl注解对返回的结果进行配置，
    - property = “role”, 表示要将返回的查询结果赋值给person的role属性
    - column = “id” 是指将person表中的用户主键id作为com.rrg.myboot.dao.RoleDao.queryRole的查询参数
    - many 表示这是一个一对多的查询
    - @Many(select = “方法全路径) 表示我们调用的方法, 方法参数userId就是上面column指定的列值
    如果是一对一，则只需要把Many修改为one即可
     */
    @Select("select id,name,age,sex,height,id_card as idCard from person where id = #{id}")
    @Results({
            @Result(property = "role",column = "id"
                    ,many = @Many(select = "com.rrg.myboot.dao.RoleDao.queryRole"))
    })
    Person getById(int id);


    @Select("select id,name,age,sex,height,id_card as idCard from person")
    List<Person> queryPerson();
}


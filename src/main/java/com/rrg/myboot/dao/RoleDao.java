package com.rrg.myboot.dao;

import com.rrg.myboot.bean.Role;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by huangsz on 2018/6/4 0004
 */
@Mapper
public interface RoleDao {

    @Insert("insert into role(role_name,person_id) values (" +
            "#{roleName},#{personId})")
    int save(Role entity);

    @Update("update person role_name=#{roleName} where id = #{id}")
    int update(Role entity);

    @Delete("delete from role where id = #{id}")
    int detele(int id);

    @Select("select d,role_name as roleName,person_id as personId where id = #{id}")
    Role getById(int id);

    @Select("select id,role_name as roleName,person_id as personId from Role where person_id = #{personId}")
    List<Role> queryRole(int personId);
}


package com.atguigu.sping5.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class UserDaoImpl implements UserDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    //少钱的方法
    @Override
    public void reduceMoney() {
        String sql="update t_account set money=money-? where username=?";
        Object[] args={100,"lucy"};
        jdbcTemplate.update(sql,args);
    }
    //多钱的方法
    @Override
    public void addMoney() {
        String sql="update t_account set money=money+? where username=?";
        Object[] args={100,"mary"};
        jdbcTemplate.update(sql,args);
    }

}

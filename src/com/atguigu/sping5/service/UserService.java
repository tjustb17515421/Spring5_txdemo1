package com.atguigu.sping5.service;

import com.atguigu.sping5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.READ_COMMITTED,timeout = -1,readOnly = false)//事务操作注解
    public void Pay()
    {
        //try{
            //第一步 开启事物

            //第二部 进行业务操作

            //Lucy少一百
            userDao.reduceMoney();

            //模拟异常
            int i=10/0;

            //Mary多一百
            userDao.addMoney();

            //第三步 没有发生异常，提交事务
        //}catch(Exception e){
            //第四步 出现异常，事物回滚
        //}

    }
}

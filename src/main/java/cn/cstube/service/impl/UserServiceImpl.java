package cn.cstube.service.impl;

import cn.cstube.service.UserService;

/**
 * @auther heling
 * @date 2021/5/22
 */
public class UserServiceImpl implements UserService {


    public void init(){
        System.out.println("init....");
    }

    public void destory(){
        System.out.println("destory....");
    }

    @Override
    public void save() {
        System.out.println("user service running...");
    }
}

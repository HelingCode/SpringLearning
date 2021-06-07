package cn.cstube.service;

import cn.cstube.service.impl.UserServiceImpl;

/**
 * @author Heling
 * @date 2021/6/7
 */
public class UserServiceFactory2 {
    public UserService getService(){
        System.out.println("instance create...");
        System.out.println("factory create object...");
        return new UserServiceImpl();
    }
}

package cn.cstube.service;

import cn.cstube.service.impl.UserServiceImpl;

/**
 * @author Heling
 * @date 2021/6/7
 */
public class UserServiceFactory {
    public static UserService getService(){
        System.out.println("factory create object...");
        return new UserServiceImpl();
    }
}

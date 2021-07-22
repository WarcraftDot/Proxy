package com.company;

import com.company.Service.UserService;
import com.company.Service.UserServiceImpl;

public class Main {

    public static void main(String[] args) {
        /**
         * 是否保存生成的代理类class文件
         */
        System.getProperties().setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        UserService userService =new UserServiceImpl();
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setTarget(userService);
        UserService proxy =(UserService) pih.getProxy();
        proxy.query();

    }
}

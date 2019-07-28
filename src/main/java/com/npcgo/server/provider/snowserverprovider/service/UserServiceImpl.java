package com.npcgo.server.provider.snowserverprovider.service;


import com.npcgo.api.UserAPI;
import com.npcgo.domain.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service("UserServiceImpl")
public class UserServiceImpl implements UserAPI {
    @Value("${server.port}")
   int port;
    @Override
    public String getString(User user) {
        Random rd= new Random();
        Integer sleeptime= rd.nextInt(10);
        try {
            Thread.sleep( sleeptime *1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "Server:"+port;
    }

    @Override
    public String HelloWorld() {
        Random rd= new Random();
        Integer sleeptime= rd.nextInt(2);
        try {
            Thread.sleep( sleeptime *1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "Hello,My Dear！";
    }
}

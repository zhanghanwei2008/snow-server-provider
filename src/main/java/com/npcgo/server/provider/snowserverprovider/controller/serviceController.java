package com.npcgo.server.provider.snowserverprovider.controller;


import com.npcgo.api.UserAPI;

import com.npcgo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class serviceController  implements UserAPI {

    @Autowired
    @Qualifier("UserServiceImpl")
    private UserAPI userAPI;


    @Override
    public String getString(@RequestBody  User user) {
        return userAPI.getString(user);
    }

    @Override
    public String HelloWorld() {
        return userAPI.HelloWorld();
    }
}

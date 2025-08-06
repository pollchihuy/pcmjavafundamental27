package com.juaracoding.pcmjavafundamental.oop.genericz.service;

import com.juaracoding.pcmjavafundamental.oop.genericz.core.IService;
import com.juaracoding.pcmjavafundamental.oop.genericz.model.User;

/**
 * modul code = 01
 * platform code = HR
 */
public class UserServiceOld implements IService<User> {

    @Override
    public void save(User user) {
        if(user==null){
            System.out.println("user is null HR01001");
        }
    }

    @Override
    public void update(Long id, User user) {
        if(user==null){
            System.out.println("user is null HR01011");
        }
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void findAll() {

    }

    @Override
    public void findById(Long id) {

    }

    @Override
    public void findByParam(String columnName, String value) {

    }
}

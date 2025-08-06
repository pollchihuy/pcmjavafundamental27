package com.juaracoding.pcmjavafundamental.oop.genericz.config;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on 06/08/2025 19:31
@Last Modified 06/08/2025 19:31
Version 1.0
*/
public class MainConfig {

    private String url;
    private String username;
    private String password;

    public MainConfig(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

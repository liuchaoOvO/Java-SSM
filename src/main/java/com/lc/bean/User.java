package com.lc.bean;

import java.io.Serializable;

/**
 * Created by liuchao on 2018/6/7.
 */
public class User implements Serializable {
    private static final long serialVersionUID = 6551106323558516531L;
    private int id;
    private String username;
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(int id,String username, String password) {
        // TODO Auto-generated constructor stub
        this.username = username;
        this.id = id;
        this.password = password;
    }

}

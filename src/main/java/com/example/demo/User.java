package com.example.demo;

/**
 * Author: dyh
 * Date:   2019/7/4
 * Description:
 */

public class User {
    public User(){

    }

    public User(Long id, String name) {
        this.id = id;
        this.name = name;
    }
    private String name;
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

package com.qf.reflect;

/**
 * @Authoer lzq
 * @DateTime 2018/11/10  9:17
 * @Version 1.0
 */
public class User {
    private Integer id;
    private String username;
    private String password;
    private String phone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}

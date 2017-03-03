package com.descto.entity;

/**
 * 用户实体
 * Created by descto on 17-3-4.
 */
public class User {

    private Integer id; //编号
    private String username; //用户名
    private String password; //密码
    private String tureName; //真实姓名
    private String phone; //电话
    private String email; //邮件

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getTureName() {
        return tureName;
    }

    public void setTureName(String tureName) {
        this.tureName = tureName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

package com.descto.entity;

import java.io.Serializable;

/**
 * 用户实体
 * Created by descto on 17-3-4.
 */
public class User implements Serializable {

    public static final String USER_STATE_OK = "正常";
    public static final String USER_STATE_DISABLE = "禁用";

    private Integer id;
    private String username; //员工姓名
    private String password;
    private String tel;
    private String createtime; //创建时间
    private String state; //员工状态

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

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}

package com.descto.entity;

import java.io.Serializable;

/**
 * Created by descto on 17-3-6.
 */
public class Role implements Serializable {

    private Integer id;
    private String rolename;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }
}

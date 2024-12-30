package com.yzj.domain;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Students {
    private Integer id;
    private String name;
    private String xingbie;
    private String ruxue;



    public Integer getId() {return id;}
    public void setId(Integer id) {this.id = id;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getXingbie() {return xingbie;}
    public void setXingbie(String xingbie) {this.xingbie = xingbie;}
    public String getRuxue() {return ruxue;}
    public void setRuxue(String ruxue) {this.ruxue = ruxue;}

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", xingbie='" + xingbie + '\'' +
                ", ruxue='" + ruxue + '\'' +
                '}';
    }

}



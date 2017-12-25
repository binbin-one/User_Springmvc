package com.springmvc.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by xiu on 2017/10/31.
 */
@Entity
@Table(name = "tb_userteo")
public class Users implements Serializable{

    private int uno;
    private String uname;
    private String usex;
    private int uage;
    private String uhobby;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date uintime;

    public Users() {
    }

    public Users(int uno, String usex,String uname, int uage, String uhobby, Date uintime) {
        this.uno = uno;
        this.uname = uname;
        this.usex=usex;
        this.uage = uage;
        this.uhobby = uhobby;
        this.uintime = uintime;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getUno() {
        return uno;
    }

    public void setUno(int uno) {
        this.uno = uno;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUsex() {
        return usex;
    }

    public void setUsex(String usex) {
        this.usex = usex;
    }

    public int getUage() {
        return uage;
    }

    public void setUage(int uage) {
        this.uage = uage;
    }

    public String getUhobby() {
        return uhobby;
    }

    public void setUhobby(String uhobby) {
        this.uhobby = uhobby;
    }

    public Date getUintime() {
        return uintime;
    }

    public void setUintime(Date uintime) {
        this.uintime = uintime;
    }
}

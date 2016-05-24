package com.duoduo.repositories;

import com.duoduo.Util;

import javax.persistence.*;
import javax.persistence.Entity;
import java.util.UUID;

/**
 * Created by AngelQian on 5/23/16.
 */

@Entity
@Table(name = "USER")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "uid")
    private String uid;

    @Column(name = "uname"/*, nullable = false, unique = true*/)
    private String uname;

    @Column(name = "upwd"/*, nullable = false*/)
    private String upwd;

    @Column(name = "uemail"/*, nullable = false, unique = true*/)
    private String uemail;

    @Column(name = "uqq"/*, nullable = false, unique = true*/)
    private String uqq;

    @Column(name = "uactive")
    private boolean uactive;

    @Column(name = "uword")
    private String uword;

    public String getUid() {
        return uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public String getUemail() {
        return uemail;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail;
    }

    public String getUqq() {
        return uqq;
    }

    public void setUqq(String uqq) {
        this.uqq = uqq;
    }

    public boolean isUactive() {
        return uactive;
    }

    public void setUactive(boolean uactive) {
        this.uactive = uactive;
    }

    public String getUword() {
        return uword;
    }

    public void setUword(String uword) {
        this.uword = uword;
    }

    public User(String uname, String upwd, String uemail, String uqq, boolean uactive, String uword) {
        this.uid = Util.convertUUIDtoString(UUID.randomUUID());
        this.uname = uname;
        this.upwd = upwd;
        this.uemail = uemail;
        this.uqq = uqq;
        this.uactive = uactive;
        this.uword = uword;
    }

    public User(String uname, String upwd, String uemail, String uqq) {
        this.uid = Util.convertUUIDtoString(UUID.randomUUID());
        this.uname = uname;
        this.upwd = upwd;
        this.uemail = uemail;
        this.uqq = uqq;
    }

    public User() {
        this.uid = Util.convertUUIDtoString(UUID.randomUUID());
    }
}

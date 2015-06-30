package com.example.Alex.myapplication.backend;

import com.googlecode.objectify.annotation.Container;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;

/**
 * The Objectify object model for device registrations we are persisting
 */
@Entity
public class RegistrationRecord {

    @Id
    Long id;

    @Index
    private String regId;

    public RegistrationRecord() {
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    @Index
    private String phone;
//    @Index

    private UserInfo userInfo;


    public String getRegId() {
        return regId;
    }

    public void setRegId(String regId) {
        this.regId = regId;
    }


    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }


}
package com.example.Alex.myapplication.backend.models;

/**
 * Created by Alex on 26.06.2015.
 */
public class User {

    private long id;
    private String username;
    private String imageAuthor;
    private String regId;

    public String getRegId() {
        return regId;
    }

    public void setRegId(String regId) {
        this.regId = regId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getImageAuthor() {
        return imageAuthor;
    }

    public void setImageAuthor(String imageAuthor) {
        this.imageAuthor = imageAuthor;
    }

}

package com.example.viewpager2.Fragments;

public class Images {

    private String imageURL;
    private String msg;


    public Images(String imageURL, String msg) {
        this.imageURL = imageURL;
        this.msg = msg;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}


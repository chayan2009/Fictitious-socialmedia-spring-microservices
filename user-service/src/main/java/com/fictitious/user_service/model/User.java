package com.fictitious.user_service.model;

public class User {
    
    private String userId;
    private String userName;
    private String phoneNumber;
    private Post post;
    private Notification notification;

    
    
    public User(String userId, String userName, String phoneNumber, Post post, Notification notification) {
        this.userId = userId;
        this.userName = userName;
        this.phoneNumber = phoneNumber;
        this.post = post;
        this.notification = notification;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public Notification getNotification() {
        return notification;
    }

    public void setNotification(Notification notification) {
        this.notification = notification;
    }


    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    
}

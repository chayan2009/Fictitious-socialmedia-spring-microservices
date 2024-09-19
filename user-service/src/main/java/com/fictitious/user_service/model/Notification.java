package com.fictitious.user_service.model;

public class Notification {
    
    private String notificationId;
    private String notificationDesc;

    public Notification(String notificationId, String notificationDesc) {
        this.notificationId = notificationId;
        this.notificationDesc = notificationDesc;
    }


    public String getNotificationId() {
        return notificationId;
    }
    public void setNotificationId(String notificationId) {
        this.notificationId = notificationId;
    }
    public String getNotificationDesc() {
        return notificationDesc;
    }
    public void setNotificationDesc(String notificationDesc) {
        this.notificationDesc = notificationDesc;
    }

    

}

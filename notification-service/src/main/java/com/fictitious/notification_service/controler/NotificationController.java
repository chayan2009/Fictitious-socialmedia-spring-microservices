package com.fictitious.notification_service.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fictitious.notification_service.model.Notification;

@RestController
@RequestMapping("/notification")
public class NotificationController {
    
    @GetMapping("/{notifyid}")
    public Notification getNotification(@PathVariable ("notifyid") String notifyid){
        Notification notification=new Notification("notication1", "notiofcation data");
        return notification;
    }
}

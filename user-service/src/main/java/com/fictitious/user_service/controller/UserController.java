package com.fictitious.user_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fictitious.user_service.model.Notification;
import com.fictitious.user_service.model.Post;
import com.fictitious.user_service.model.User;

@RestController
@RequestMapping("/user")
public class UserController {
    

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{userId}")
    public User getUser(@PathVariable("userId") String userId){

        User userone=new User(userId, "chayan","XXXXXXX",null,null);
        
        Post postsData=restTemplate.getForObject("http://localhost:8084/post/1", Post.class) ;

        userone.setPost(postsData);

        Notification notifyData=restTemplate.getForObject("http://localhost:8085/notification/1", Notification.class) ;
        userone.setNotification(notifyData);
        
        return userone;
    }
}

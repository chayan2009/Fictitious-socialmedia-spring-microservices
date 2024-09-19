package com.fictitious.profile_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fictitious.profile_service.model.Post;

@RestController
@RequestMapping("/post")
public class PostControler {
    
    @GetMapping("/{postId}")
    public Post getPost(@PathVariable("postId") String postId){

        Post posts=new Post("Post Id 1", "Post Description");

        return posts;

    }
}

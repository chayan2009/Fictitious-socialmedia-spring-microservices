package com.fictitious.profile_service.model;

public class Post {

    private String postId;
    private String postDesc;

    public Post(String postId, String postDesc) {
        this.postId = postId;
        this.postDesc = postDesc;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getPostDesc() {
        return postDesc;
    }

    public void setPostDesc(String postDesc) {
        this.postDesc = postDesc;
    }

}

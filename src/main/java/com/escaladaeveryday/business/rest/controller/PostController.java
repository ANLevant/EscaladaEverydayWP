package com.escaladaeveryday.business.rest.controller;

import com.escaladaeveryday.business.dto.PostDTO;
import com.escaladaeveryday.business.service.IPostService;
import com.escaladaeveryday.persistence.model.PostEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posts")
public class PostController {

    @Autowired
    private IPostService postService;

    @RequestMapping(method = RequestMethod.POST)
    public void addPost(PostDTO postToAddDTO) {
        postService.addPost(postToAddDTO);
    }

    @RequestMapping(method = RequestMethod.GET)
    public PostDTO getPost(PostDTO postToFetchDTO) {
        return postService.getPost(postToFetchDTO);
    }
}

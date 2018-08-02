package com.escaladaeveryday.business.service;

import com.escaladaeveryday.business.dto.PostDTO;

public interface IPostService {
    void addPost(PostDTO postToAddDTO);
    PostDTO getPost(PostDTO postToFetchDTO);
}

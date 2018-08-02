package com.escaladaeveryday.business.service.impl;

import com.escaladaeveryday.business.builder.EntityDTOBuilder;
import com.escaladaeveryday.business.dto.PostDTO;
import com.escaladaeveryday.business.service.IPostService;
import com.escaladaeveryday.persistence.model.PostEntity;
import com.escaladaeveryday.persistence.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements IPostService {

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private EntityDTOBuilder<PostEntity, PostDTO> builder;

    @Override
    public void addPost(PostDTO postToAddDTO) {
        PostEntity postToAdd = builder.entityToDTO(postToAddDTO);
        postRepository.save(postToAdd);
    }

    @Override
    public PostDTO getPost(PostDTO postToFetchDTO) {
        PostEntity postFound = postRepository.getOne(postToFetchDTO.getIdPost());

        return builder.DTOToEntity(postFound);
    }
}
package com.escaladaeveryday.persistence.repository;

import com.escaladaeveryday.persistence.model.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface PostRepository extends JpaRepository<PostEntity, Integer> {
}

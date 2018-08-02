package com.escaladaeveryday.application;

import com.escaladaeveryday.persistence.repository.PostRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.escaladaeveryday.persistence.model")
@EnableJpaRepositories(basePackages = "com.escaladaeveryday.persistence.repository")
@ComponentScan(basePackages = "com.escaladaeveryday.business")
public class EscaladaEverydaySpringApplication {

   public static void main(String[] args) {
      SpringApplication.run(EscaladaEverydaySpringApplication.class, args);
   }

}
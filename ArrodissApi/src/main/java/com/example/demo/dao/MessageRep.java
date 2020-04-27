package com.example.demo.dao;

import com.example.demo.entities.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;


@RepositoryRestResource
public interface MessageRep extends JpaRepository<Message, Long> {

}

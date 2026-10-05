package com.projetospring.course.resource;

import com.projetospring.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/users")
@RestController
public class UserResource  {
@GetMapping
public ResponseEntity<User>findAll(){
    User u = new User(1L, "Maria", "maria@gmail.com", "349999999", "123456");
    return ResponseEntity.ok().body(u);
    }

}

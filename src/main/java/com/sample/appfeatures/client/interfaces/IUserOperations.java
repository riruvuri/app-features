package com.sample.appfeatures.client.interfaces;

import com.sample.appfeatures.dto.UserGetDto;
import com.sample.appfeatures.dto.UserPostDto;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/users")
public interface IUserOperations {

    @PostMapping
    public String createUser(@Valid @RequestBody UserPostDto userDto);

    @GetMapping("/{id}")
    public ResponseEntity<UserGetDto> getUser(long id);
}

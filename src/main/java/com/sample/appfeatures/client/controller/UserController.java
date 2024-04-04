package com.sample.appfeatures.client.controller;

import com.sample.appfeatures.client.interfaces.IUserOperations;
import com.sample.appfeatures.dto.UserGetDto;
import com.sample.appfeatures.dto.UserPostDto;
import com.sample.appfeatures.service.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController implements IUserOperations {

    private AppUserService appUserService;

    @Autowired
    public UserController(AppUserService appUserService) {
        this.appUserService = appUserService;
    }

    @Override
    public String createUser(UserPostDto userDto) {
        appUserService.createUser(userDto);

        return null;
    }

    @Override
    public ResponseEntity<UserGetDto> getUser(@PathVariable(value = "id") long id) {
        return new ResponseEntity<>(
                appUserService.findUser(id),
                HttpStatus.OK
        );
    }
}

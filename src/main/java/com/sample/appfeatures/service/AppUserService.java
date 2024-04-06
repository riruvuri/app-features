package com.sample.appfeatures.service;

import com.sample.appfeatures.dto.UserGetDto;
import com.sample.appfeatures.dto.UserPostDto;
import com.sample.appfeatures.exception.ResourceNotFoundException;
import com.sample.appfeatures.mapper.AppUserMapper;
import com.sample.appfeatures.model.entity.AppUser;
import com.sample.appfeatures.model.repository.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AppUserService {

    @Autowired
    AppUserRepository appUserRepository;

    @Autowired
    AppUserMapper appUserMapper;

    public void createUser(UserPostDto userDto) {
        AppUser appUser = appUserMapper.userToAppUser(userDto);
        appUser = appUserRepository.save(appUser);
        System.out.println(appUser.getId());
    }

    public UserGetDto findUser(Long id) {
        Optional<AppUser> appUserResponse = appUserRepository.findById(id)
                .map(Optional::of)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with id:"+id));

        return appUserMapper.appUserToUser(appUserResponse.get());
    }
}

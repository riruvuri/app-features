package com.sample.appfeatures.mapper;

import com.sample.appfeatures.dto.UserGetDto;
import com.sample.appfeatures.dto.UserPostDto;
import com.sample.appfeatures.model.entity.AppUser;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface AppUserMapper {
    AppUserMapper INSTANCE = Mappers.getMapper(AppUserMapper.class);
    AppUser userToAppUser(UserPostDto user);
    UserGetDto appUserToUser(AppUser appUser);
}
package com.example.administration.mapper;

import com.example.administration.dto.request.UserCreationRequest;
import com.example.administration.dto.request.UserUpdateRequest;
import com.example.administration.dto.response.UserResponse;
import com.example.administration.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);

    UserResponse toUserResponse(User user);

    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}

package com.example.administration.service;

import com.example.administration.dto.request.UserCreationRequest;
import com.example.administration.dto.request.UserUpdateRequest;
import com.example.administration.dto.response.UserResponse;

import java.util.List;

public interface UserService {
    List<UserResponse> getUsers();

    UserResponse getUserById(int id);

    UserResponse getMyInfo();

    UserResponse createUser(UserCreationRequest request);

    UserResponse updateUser(int userId, UserUpdateRequest request);

    void deleteUser(int userId);
}

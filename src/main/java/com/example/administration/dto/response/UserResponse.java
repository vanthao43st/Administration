package com.example.administration.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserResponse {
    int id;
    String username;
    String password;
    String fullname;
    String birthday;
    String mobilephone;
    String email;
    String address;
    String job;
    String position;
}

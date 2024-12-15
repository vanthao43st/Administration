package com.example.administration.dto.request;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor // Tự động tạo constructor đầy đủ tham số đối với các thuộc tính là final
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserCreationRequest {
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

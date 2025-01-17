package com.example.springPROJECT.Service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springPROJECT.payloads.UserDto;
@Service
public interface UserService {
    UserDto createUser (UserDto user);

    UserDto updateUser (UserDto user, Integer userId);

    UserDto getUserById (Integer userId);

    List<UserDto> getAllUsers();

    void deleteUser(Integer userId);



}
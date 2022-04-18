package net.waa.g7backend.user.service;

import net.waa.g7backend.user.dto.UserDto;
import net.waa.g7backend.user.model.User;

import java.util.List;
import java.util.Optional;


public interface UserService {

    List<User> findAll();

    UserDto findById(long id);


    UserDto add(UserDto dto);

    UserDto updateById(long id, UserDto dto);

    void deleteById(long id);

    UserDto addBuyer(UserDto dto);

    UserDto addSeller(UserDto dto);




}

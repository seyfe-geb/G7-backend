package net.waa.g7backend.service.interfaces;



import net.waa.g7backend.model.User;
import net.waa.g7backend.model.dto.UserDto;

import java.util.List;


public interface UserService {

    List<UserDto> findAll();

    UserDto findById(long id);


    UserDto add(UserDto dto);

    UserDto updateById(long id, UserDto dto);

    void deleteById(long id);

    UserDto addBuyer(UserDto dto);

    UserDto addSeller(UserDto dto);




}

package net.waa.g7backend.user.service;

import lombok.RequiredArgsConstructor;
import net.waa.g7backend.address.dto.AddressDto;
import net.waa.g7backend.address.model.Address;
import net.waa.g7backend.address.model.AddressType;
import net.waa.g7backend.role.repository.RoleRepository;
import net.waa.g7backend.user.dto.UserDto;
import net.waa.g7backend.user.model.User;
import net.waa.g7backend.user.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    private final RoleRepository roleRepository;


    @Override
    public List<UserDto> findAll() {
        return userRepository.findAll().stream()
                .map(u -> modelMapper.map(u, UserDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public UserDto findById(long id) {
        return modelMapper.map(userRepository.findById(id).orElse(null), UserDto.class);
    }

    @Override
    public UserDto add(UserDto dto) {

        User user = new User(dto.getFirstName(), dto.getLastName(), dto.getEmail(),
                dto.getUsername(), dto.getPassword(), true, false, LocalDate.now(), LocalDate.now());
        userRepository.save(user);
        if (!dto.getAuthorities().isEmpty()) {
            user.setAuthorities(new HashSet<>(3));

            for (String authority : dto.getAuthorities())
                user.getAuthorities().add(roleRepository.findByAuthority(authority));
        }

        user = userRepository.save(user);
        return dto;
    }

    @Override
    public UserDto updateById(long id, UserDto dto) {
        User user = userRepository.getById(id);

//        if(!dto.getEmail().isEmpty())
//            user.setEmail(dto.getEmail());
//
//        if(!dto.getFname().isEmpty())
//            user.setFname(dto.getFname());
//
//        if(!dto.getLname().isEmpty())
//            user.setLname(dto.getLname());

        return modelMapper.map(userRepository.save(user), UserDto.class);
    }

    @Override
    public void deleteById(long id) {
     userRepository.deleteById(id);
    }

    @Override
    public UserDto addBuyer(UserDto dto) {
        return null;
    }

    @Override
    public UserDto addSeller(UserDto dto) {
        return null;
    }


}

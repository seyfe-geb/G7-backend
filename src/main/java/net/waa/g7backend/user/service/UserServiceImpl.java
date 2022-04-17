package net.waa.g7backend.user.service;

import lombok.RequiredArgsConstructor;
import net.waa.g7backend.user.dto.UserDto;
import net.waa.g7backend.user.model.User;
import net.waa.g7backend.user.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository repository;
    private final ModelMapper modelMapper;


    @Override
    public List<UserDto> findAll() {
        return repository.findAll().stream()
                .map(u -> modelMapper.map(u, UserDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public UserDto findById(long id) {
        return modelMapper.map(repository.findById(id).orElse(null), UserDto.class);
    }

    @Override
    public UserDto add(UserDto dto) {
        return null;
    }

    @Override
    public UserDto updateById(long id, UserDto dto) {
        User user = repository.getById(id);

//        if(!dto.getEmail().isEmpty())
//            user.setEmail(dto.getEmail());
//
//        if(!dto.getFname().isEmpty())
//            user.setFname(dto.getFname());
//
//        if(!dto.getLname().isEmpty())
//            user.setLname(dto.getLname());

        return modelMapper.map(repository.save(user), UserDto.class);
    }

    @Override
    public void deleteById(long id) {
     repository.deleteById(id);
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

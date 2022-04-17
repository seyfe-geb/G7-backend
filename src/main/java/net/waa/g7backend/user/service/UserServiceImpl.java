package net.waa.g7backend.user.service;

import lombok.RequiredArgsConstructor;
import net.waa.g7backend.user.dto.UserDto;
import net.waa.g7backend.user.model.User;
import net.waa.g7backend.user.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository repository;


    @Override
    public List<UserDto> findAll() {
        return repository.findAll();
    }

    @Override
    public UserDto findById(long id) {
        return repository.findById(id);
    }

    @Override
    public UserDto add(UserDto dto) {
        return null;
    }

    @Override
    public UserDto updateById(long id, UserDto dto) {
        return null;
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

    @Override
    public boolean existsByUsername(String username) {
        return repository.existsByUsername(username);
    }

    @Override
    public UserDto approveById(long id) {
        return null;
    }
}

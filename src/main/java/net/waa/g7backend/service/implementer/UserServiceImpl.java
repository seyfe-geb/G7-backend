package net.waa.g7backend.service.implementer;

import lombok.RequiredArgsConstructor;
import net.waa.g7backend.model.User;
import net.waa.g7backend.model.dto.UserDto;
import net.waa.g7backend.repository.RoleRepository;
import net.waa.g7backend.service.interfaces.UserService;
import net.waa.g7backend.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    private final RoleRepository roleRepository;


    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public UserDto findById(long id) {
        return modelMapper.map(userRepository.findById(id).orElse(null), UserDto.class);
    }

    @Override
    public UserDto add(UserDto dto) {
       User user = new User(dto.getFirstName(), dto.getLastName(),
               dto.getEmail(), dto.getUsername(), dto.getPassword(),
        true, false,
        LocalDate.now(), LocalDate.now());

        if (!dto.getAuthorities().isEmpty()) {
            user.setAuthorities(new HashSet<>(3));

            for (String authority : dto.getAuthorities())
                user.getAuthorities().add(roleRepository.findByAuthority(authority));
        }

        userRepository.save(user);
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

    @Override
    public void test() {
        System.out.println("Testing...");
    }


}

package net.waa.g7backend.service.implementer;

import lombok.RequiredArgsConstructor;
import net.waa.g7backend.model.Address;
import net.waa.g7backend.model.AddressType;
import net.waa.g7backend.model.User;
import net.waa.g7backend.model.dto.AddressDto;
import net.waa.g7backend.model.dto.UserDto;
import net.waa.g7backend.repository.AddressRepository;
import net.waa.g7backend.repository.RoleRepository;
import net.waa.g7backend.service.interfaces.AddressService;
import net.waa.g7backend.service.interfaces.UserService;
import net.waa.g7backend.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final AddressService addressService;
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

    @Transactional
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
        user = userRepository.findUserByUsername(user.getUsername());
        if (user.getAddresses() == null) {
            user.setAddresses(new HashSet<>(2));
            for(AddressDto ad : dto.getAddresses()){
//            ad.setUserId(user.getId());
//            addressService.add(ad);
                user.getAddresses().add(new Address(ad.getStreet(), ad.getCity(), ad.getState(), ad.getZipCode(), AddressType.valueOf(ad.getType())));
            }
        }

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

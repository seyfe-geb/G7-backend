package net.waa.g7backend.service.implementer;

import lombok.RequiredArgsConstructor;
import net.waa.g7backend.model.dto.AddressDto;
import net.waa.g7backend.model.dto.SaveAddressDto;
import net.waa.g7backend.model.Address;
import net.waa.g7backend.model.AddressType;
import net.waa.g7backend.repository.AddressRepository;
import net.waa.g7backend.service.interfaces.AddressService;
import net.waa.g7backend.user.model.User;
import net.waa.g7backend.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {
    private final AddressRepository addressRepository;
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<AddressDto> findAll() {
        return addressRepository.findAll().stream()
                .map(a -> modelMapper.map(a, AddressDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public AddressDto findById(long id) {
        return modelMapper.map(addressRepository.findById(id).orElse(null), AddressDto.class);
    }

    @Override
    public AddressDto add(AddressDto dto) {
        User user = userRepository.findById(dto.getUserId()).orElse(null);
        Address entity = new Address(dto.getStreet(), dto.getCity(), dto.getState(),dto.getZipCode(), AddressType.valueOf(dto.getType()));
        entity.setUser(user);
        addressRepository.save(entity);
        return dto;
    }

    @Override
    public void deleteById(long id) {
        addressRepository.deleteById(id);
    }

    @Override
    public AddressDto updateById(long id, SaveAddressDto dto) {
        Address entity = modelMapper.map(dto , Address.class);
        entity.setId(id);
        return  modelMapper.map(addressRepository.save(entity), AddressDto.class);
    }
}

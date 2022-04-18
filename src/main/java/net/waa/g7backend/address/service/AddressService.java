package net.waa.g7backend.address.service;

import net.waa.g7backend.address.dto.AddressDto;
import net.waa.g7backend.address.dto.SaveAddressDto;

import java.util.List;

public interface AddressService {
    List<AddressDto> findAll();
    AddressDto findById(long id);
    AddressDto add(AddressDto dto);
    void deleteById(long id);
    AddressDto updateById(long id, SaveAddressDto dto);

}

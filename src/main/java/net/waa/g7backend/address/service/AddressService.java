package net.waa.g7backend.address.service;

import net.waa.g7backend.model.dto.AddressDto;
import net.waa.g7backend.model.dto.SaveAddressDto;

import java.util.List;

public interface AddressService {
    List<AddressDto> findAll();
    AddressDto findById(long id);
    AddressDto add(AddressDto dto);
    void deleteById(long id);
    AddressDto updateById(long id, SaveAddressDto dto);

}

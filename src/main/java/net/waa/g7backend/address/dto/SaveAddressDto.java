package net.waa.g7backend.address.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.waa.g7backend.address.model.AddressType;
@Data
@AllArgsConstructor@NoArgsConstructor
public class SaveAddressDto {
    private String street;


    private String city;

    private String state;


    private String zipCode;

    private AddressType type;

    private long userId;
}

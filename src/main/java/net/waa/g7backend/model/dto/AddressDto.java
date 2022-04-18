package net.waa.g7backend.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class AddressDto {
    private String street;

    private String city;

    private String state;
    private String zipCode;

    private String type;

    private long userId;

}

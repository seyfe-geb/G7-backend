package net.waa.g7backend.model.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.waa.g7backend.address.model.AddressType;
import net.waa.g7backend.user.model.User;

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

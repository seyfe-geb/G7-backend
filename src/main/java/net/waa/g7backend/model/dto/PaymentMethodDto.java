package net.waa.g7backend.model.dto;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import net.waa.g7backend.model.PaymentMethodType;


@Data
@RequiredArgsConstructor
public class PaymentMethodDto {

    private long id;

//    @NotBlank
    private String name;

    @NotNull
    private PaymentMethodType type;

//    @NotBlank
    @NotNull
    private String number;

    private boolean isDefault;

    private long billingAddressId;

//    @JsonBackReference
//    private UserDto user;
}

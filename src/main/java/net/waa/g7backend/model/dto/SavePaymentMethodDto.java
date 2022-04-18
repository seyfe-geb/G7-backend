package net.waa.g7backend.model.dto;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import net.waa.g7backend.model.PaymentMethodType;


@Data
@RequiredArgsConstructor
public class SavePaymentMethodDto {

    private String name;

    @NotNull
    private PaymentMethodType type;

//    @NotBlank
    @NotNull
    private String number;

    @NotNull
//    @Digits(integer = 5, fraction = 0)
    private int csv;

    private boolean isDefault;

    private long billingAddressId;

    private long userId;
}

package net.waa.g7backend.paymentmethod.dto;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.waa.g7backend.paymentmethod.model.PaymentMethodType;


@Data
@AllArgsConstructor
@NoArgsConstructor
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

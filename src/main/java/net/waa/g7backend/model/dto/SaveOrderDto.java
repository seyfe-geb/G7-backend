package net.waa.g7backend.model.dto;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@RequiredArgsConstructor
@Data
public class SaveOrderDto {

    private long id;

    @NotNull
    @NotEmpty
    private List<SaveOrderItemDto> orderItems;

    private long shippingAddressId;

    private long paymentMethodId;
}

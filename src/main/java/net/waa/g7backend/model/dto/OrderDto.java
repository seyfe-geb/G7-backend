package net.waa.g7backend.model.dto;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.sun.istack.NotNull;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import net.waa.g7backend.model.OrderStatus;

import java.util.Date;
import java.util.List;

@RequiredArgsConstructor
@Data
public class OrderDto {

    private long id;

    private OrderStatus status;

    private Date createdAt;
    private Date modifiedAt;

    @NotNull
    private double price;

    @JsonManagedReference
    private List<OrderItemDto> orderItems;

    private AddressDto shippingAddress;

    private PaymentMethodDto paymentMethod;

    private UserDto user;

    private String invoiceUri;
}

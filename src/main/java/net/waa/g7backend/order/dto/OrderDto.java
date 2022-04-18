package net.waa.g7backend.order.dto;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.sun.istack.NotNull;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import net.waa.g7backend.address.dto.AddressDto;
import net.waa.g7backend.order.model.OrderStatus;
import net.waa.g7backend.paymentmethod.dto.PaymentMethodDto;

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

    private LightUserDto user;

    private String invoiceUri;
}

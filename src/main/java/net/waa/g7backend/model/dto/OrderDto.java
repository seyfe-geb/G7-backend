package net.waa.g7backend.model.dto;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.sun.istack.NotNull;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import net.waa.g7backend.model.OrderStatus;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

@RequiredArgsConstructor
@Data
public class OrderDto {

//    private long id;
//
//    private Date createdAt;
//    private Date modifiedAt;
//
//    @NotNull
//    private double price;
//
//    @JsonManagedReference
//    private List<OrderItemDto> orderItems;
//
//    private AddressDto shippingAddress;
    private long userId;

    private String paymentMethod;

    private HashMap<String, Integer> productIds;



}

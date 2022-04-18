package net.waa.g7backend.order.dto.service;

import net.waa.g7backend.order.dto.OrderDto;
import net.waa.g7backend.order.dto.SaveOrderDto;
import net.waa.g7backend.order.model.OrderStatus;


import java.util.List;

public interface OrderService {

    List<OrderDto> findAll();
    List<OrderDto> findAllByUserId();
    List<OrderDto> findSellerOrders();

    OrderDto findById(long id);

    OrderDto add(SaveOrderDto dto); //throws ValidationException;

    OrderDto changeStatusById(long id, OrderStatus status); // throws ValidationExc
}

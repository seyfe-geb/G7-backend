package net.waa.g7backend.order.dto.service;

import net.waa.g7backend.order.dto.OrderItemDto;
import net.waa.g7backend.order.dto.SaveOrderItemDto;

import java.util.List;

public interface OrderItemService {

    List<OrderItemDto> findAll();

    OrderItemDto findById(long id);

    SaveOrderItemDto add(SaveOrderItemDto dto);

    void deleteById(long id);
}

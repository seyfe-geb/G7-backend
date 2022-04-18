package net.waa.g7backend.service.interfaces;


import net.waa.g7backend.model.dto.OrderItemDto;
import net.waa.g7backend.model.dto.SaveOrderItemDto;

import java.util.List;

public interface OrderItemService {

    List<OrderItemDto> findAll();

    OrderItemDto findById(long id);

    SaveOrderItemDto add(SaveOrderItemDto dto);

    void deleteById(long id);
}

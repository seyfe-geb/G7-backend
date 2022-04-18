package net.waa.g7backend.service.interfaces;




import net.waa.g7backend.model.OrderStatus;
import net.waa.g7backend.model.dto.OrderDto;
import net.waa.g7backend.model.dto.SaveOrderDto;

import java.util.List;

public interface OrderService {

    List<OrderDto> findAll();
    List<OrderDto> findAllByUserId();
    List<OrderDto> findSellerOrders();

    OrderDto findById(long id);

    OrderDto add(SaveOrderDto dto); //throws ValidationException;

    OrderDto changeStatusById(long id, OrderStatus status); // throws ValidationExc
}

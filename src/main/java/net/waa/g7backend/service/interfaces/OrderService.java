package net.waa.g7backend.service.interfaces;




import net.waa.g7backend.model.Order;
import net.waa.g7backend.model.OrderStatus;
import net.waa.g7backend.model.dto.OrderDto;
import net.waa.g7backend.model.dto.SaveOrderDto;

import java.util.List;

public interface OrderService {

    List<Order> findAll();
    List<OrderDto> findAllByUserId();
    List<OrderDto> findSellerOrders();

    OrderDto findById(long id);

    Order add(OrderDto dto); //throws ValidationException;

    OrderDto changeStatusById(long id, OrderStatus status); // throws ValidationExc
}

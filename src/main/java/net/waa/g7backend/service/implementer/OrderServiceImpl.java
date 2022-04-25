package net.waa.g7backend.service.implementer;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import net.waa.g7backend.model.OrderStatus;
import net.waa.g7backend.model.dto.OrderDto;
import net.waa.g7backend.model.dto.SaveOrderDto;
import net.waa.g7backend.service.interfaces.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {


    @Override
    public List<OrderDto> findAll() {
        return null;
    }

    @Override
    public List<OrderDto> findAllByUserId() {
        return null;
    }

    @Override
    public List<OrderDto> findSellerOrders() {
        return null;
    }

    @Override
    public OrderDto findById(long id) {
        return null;
    }

    @Override
    public OrderDto add(SaveOrderDto dto) {
        return null;
    }

    @Override
    public OrderDto changeStatusById(long id, OrderStatus status) {
        return null;
    }
}

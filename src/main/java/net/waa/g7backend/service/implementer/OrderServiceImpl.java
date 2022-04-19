package net.waa.g7backend.service.implementer;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import net.waa.g7backend.model.*;
import net.waa.g7backend.model.dto.OrderDto;
import net.waa.g7backend.model.dto.SaveOrderDto;
import net.waa.g7backend.repository.OrderRepository;
import net.waa.g7backend.repository.ProductRepository;
import net.waa.g7backend.repository.UserRepository;
import net.waa.g7backend.service.interfaces.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@Data
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {


    private final OrderRepository orderRepository;
    private final UserRepository userRepository;
    private final ProductRepository productRepository;


    @Override
    public List<Order> findAll() {

        return orderRepository.findAll();
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
    public Order add(OrderDto dto) {
        User user = userRepository.findUserShippingAddress(dto.getUserId());
        Set<OrderItem> ois = new HashSet<>();
        if(dto.getProductIds() != null && dto.getProductIds().size() > 0){
            for(String id : dto.getProductIds().keySet()){
                Long pid = Long.valueOf(id);
                Product product = productRepository.getById(pid);
                ois.add(new OrderItem(dto.getProductIds().get(id), product.getPrice(), product));
            }

        }
        double totalPrice = 0.0;
        Order order = null;
        for(OrderItem oi : ois){
            totalPrice += oi.getPrice();
        }
        for (Address a : user.getAddresses()){
            if(a.getType() == AddressType.SHIPPING){
                order = new Order(LocalDate.now(), LocalDate.now(), totalPrice, ois, a, user);
            }
        }

        if(order != null){
            orderRepository.save(order);
        }

        return order;
    }

    @Override
    public OrderDto changeStatusById(long id, OrderStatus status) {
        return null;
    }
}

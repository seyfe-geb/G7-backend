package net.waa.g7backend.service.implementer;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import net.waa.g7backend.order.dto.OrderItemDto;
import net.waa.g7backend.order.dto.SaveOrderItemDto;
import net.waa.g7backend.repository.OrderItemRepository;
import net.waa.g7backend.repository.ProductRepository;
import net.waa.g7backend.service.interfaces.OrderItemService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Data
@RequiredArgsConstructor
public class OrderItemServiceImpl implements OrderItemService {

    private final OrderItemRepository orderItemRepository;
    private final ProductRepository productRepository;
    private final ModelMapper modelMapper;


    @Override
    public List<OrderItemDto> findAll() {
        return orderItemRepository.findAll().stream()
                .map(o -> modelMapper.map(o, OrderItemDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public OrderItemDto findById(long id) {
        return modelMapper.map(orderItemRepository.findById(id).orElse(null), OrderItemDto.class);
    }

    @Override
    public SaveOrderItemDto add(SaveOrderItemDto dto) {
        return null;
    }

    @Override
    public void deleteById(long id) {
        orderItemRepository.deleteById(id);
    }
}

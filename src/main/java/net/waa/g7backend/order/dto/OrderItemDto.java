package net.waa.g7backend.order.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import net.waa.g7backend.product.dto.ProductDto;

@RequiredArgsConstructor
@Data
public class OrderItemDto {


    private long id;

    private int quantity;

    private ProductDto product;

    @JsonBackReference
    private OrderDto order;
}

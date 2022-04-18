package net.waa.g7backend.model.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
public class OrderItemDto {


    private long id;

    private int quantity;

    private ProductDto product;

    @JsonBackReference
    private OrderDto order;
}

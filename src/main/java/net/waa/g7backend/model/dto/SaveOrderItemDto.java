package net.waa.g7backend.model.dto;


import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class SaveOrderItemDto {

    private long id;

    private int quantity;

    private long productId;

    private long orderId;
}

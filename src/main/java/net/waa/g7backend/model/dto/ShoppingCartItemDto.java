package net.waa.g7backend.model.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ShoppingCartItemDto {

    private int quantity;

    private Long productId;
}

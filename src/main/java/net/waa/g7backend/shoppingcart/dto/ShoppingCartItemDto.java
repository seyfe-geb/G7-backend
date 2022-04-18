package net.waa.g7backend.shoppingcart.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;
import net.waa.g7backend.product.dto.ProductDto;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ShoppingCartItemDto {

    private long id;

    @JsonBackReference
    private ShoppingCartDto cart;

    private int quantity;

    private ProductDto product;
}

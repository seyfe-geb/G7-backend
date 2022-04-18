package net.waa.g7backend.product.dto;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import net.waa.g7backend.productimage.dto.ProductImageDto;

import java.util.List;


@Data
@RequiredArgsConstructor
public class SaveProductDto {

    private String name;

    @NotNull
    private double price;

    @NotNull
    private String description;

    @NotNull
    private int quantity;

    private List<ProductImageDto> images;
}

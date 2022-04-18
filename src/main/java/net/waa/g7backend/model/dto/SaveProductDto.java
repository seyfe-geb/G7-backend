package net.waa.g7backend.model.dto;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.RequiredArgsConstructor;


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

//    private List<ProductImageDto> images;
}

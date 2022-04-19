package net.waa.g7backend.model.dto;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.Size;

@Data
@RequiredArgsConstructor
public class ProductDto {
    @NotNull
    @Size(max = 50)
    private String name;

    @NotNull
    private double price;

    @NotNull
    private String description;

    @NotNull
    private int quantity;

    private long userId;

//    @JsonManagedReference
//    private List<ReviewDto> reviews;
}

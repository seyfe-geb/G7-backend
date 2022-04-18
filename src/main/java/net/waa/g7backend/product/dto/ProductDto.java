package net.waa.g7backend.product.dto;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.sun.istack.NotNull;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import net.waa.g7backend.productimage.dto.ProductImageDto;
import net.waa.g7backend.review.dto.ReviewDto;
import net.waa.g7backend.user.dto.UserDto;

import javax.validation.constraints.Size;
import java.util.List;

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
//    private List<ProductImageDto> images;
//    @JsonManagedReference
//    private List<ReviewDto> reviews;
}

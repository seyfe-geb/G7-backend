package net.waa.g7backend.productimage.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductImageDto {
    private long id;

    @Size(max = 50)
    private String name;

    @NotNull
    private String imageUri;

    private long productId;
}

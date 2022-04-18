package net.waa.g7backend.productimage.service;

import net.waa.g7backend.productimage.dto.ProductImageDto;

import java.util.List;

public interface ProductImageService {
    List<ProductImageDto> findAll();

    ProductImageDto findById(long id);

    ProductImageDto add(ProductImageDto dto);

    ProductImageDto updateById(long id, ProductImageDto dto);

    void deleteById(long id);
}

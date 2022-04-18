package net.waa.g7backend.product.service;


import net.waa.g7backend.product.dto.ProductDto;

import java.util.List;

public interface ProductService {
    List<ProductDto> findAll();
}

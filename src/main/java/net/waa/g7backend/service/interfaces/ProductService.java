package net.waa.g7backend.service.interfaces;



import net.waa.g7backend.model.Product;
import net.waa.g7backend.model.dto.ProductDto;
import net.waa.g7backend.model.dto.SaveProductDto;

import javax.xml.bind.ValidationException;
import java.util.List;

public interface ProductService {
    List<Product> findAll();

    List<ProductDto> findAllByUserId(Long id);

    ProductDto findById(long id);

    ProductDto add(ProductDto dto);

    ProductDto add(SaveProductDto dto) throws ValidationException;

    ProductDto updateById(long id, ProductDto dto);

    void deleteById(long id) throws ValidationException;
}





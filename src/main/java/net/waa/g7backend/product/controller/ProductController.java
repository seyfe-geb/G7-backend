package net.waa.g7backend.product.controller;

import lombok.RequiredArgsConstructor;
import net.waa.g7backend.product.dto.ProductDto;
import net.waa.g7backend.service.interfaces.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.xml.bind.ValidationException;
import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping()
    public List<ProductDto> getAll() {
        return productService.findAll();
    }

    @GetMapping("/{id}")
    public ProductDto get(@PathVariable long id) {
        return productService.findById(id);
    }

    @PostMapping
    public ProductDto add(@RequestBody ProductDto dto){
        return productService.add(dto);
    }

    @PutMapping("/{id}")
    public ProductDto update(@PathVariable long id, @RequestBody ProductDto dto){
        return productService.updateById(id, dto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void delete(@PathVariable long id) throws ValidationException {

        productService.deleteById(id);
    }
}

package net.waa.g7backend.productimage.controller;

import lombok.RequiredArgsConstructor;
import net.waa.g7backend.productimage.dto.ProductImageDto;

import net.waa.g7backend.productimage.service.ProductImageService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/product-images")
@RequiredArgsConstructor
public class ProductImageController {

    private final ProductImageService imageService;

    @GetMapping
    public List<ProductImageDto> getAll(){
        return imageService.findAll();
    }

    @GetMapping("/{id}")
    public ProductImageDto get(@PathVariable("id") long id){
        return imageService.findById(id);
    }

    @PostMapping
    public ProductImageDto add(@RequestBody ProductImageDto dto){
        return imageService.add(dto);
    }

    @PutMapping("/{id}")
    public ProductImageDto update(@PathVariable("id") long id, @RequestBody ProductImageDto dto){
        return imageService.updateById(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") long id){
        imageService.deleteById(id);
    }
}

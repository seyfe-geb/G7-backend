package net.waa.g7backend.productimage.service;

import net.waa.g7backend.productimage.dto.ProductImageDto;
import net.waa.g7backend.productimage.model.ProductImage;
import net.waa.g7backend.productimage.repository.ProductImageRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductImageServiceImpl implements ProductImageService{

    private final ProductImageRepository imageRepository;
    private final ModelMapper modelMapper;

    public ProductImageServiceImpl(ProductImageRepository imageRepository, ModelMapper modelMapper) {
        this.imageRepository = imageRepository;
        this.modelMapper = modelMapper;
    }
    @Override
    public List<ProductImageDto> findAll() {
        return imageRepository.findAll().stream()
                .map(i -> modelMapper.map(i,ProductImageDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public ProductImageDto findById(long id) {
        return modelMapper.map(imageRepository.findById(id).orElse(null),ProductImageDto.class);
    }

    @Override
    public ProductImageDto add(ProductImageDto dto) {
        return modelMapper.map(imageRepository.save(modelMapper.map(dto, ProductImage.class)), ProductImageDto.class);
    }

    @Override
    public ProductImageDto updateById(long id, ProductImageDto dto) {
        dto.setId(id);
        return modelMapper.map(imageRepository.save(modelMapper.map(dto, ProductImage.class)), ProductImageDto.class);
    }

    @Override
    public void deleteById(long id) {
        imageRepository.deleteById(id);

    }
}

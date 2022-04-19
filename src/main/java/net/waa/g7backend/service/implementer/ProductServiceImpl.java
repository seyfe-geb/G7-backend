package net.waa.g7backend.service.implementer;


import lombok.Data;
import lombok.RequiredArgsConstructor;
import net.waa.g7backend.model.OrderItem;
import net.waa.g7backend.model.Product;
import net.waa.g7backend.model.User;
import net.waa.g7backend.model.dto.ProductDto;
import net.waa.g7backend.model.dto.SaveProductDto;

import net.waa.g7backend.repository.OrderItemRepository;

import net.waa.g7backend.repository.ProductRepository;
import net.waa.g7backend.service.interfaces.ProductService;

import net.waa.g7backend.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.xml.bind.ValidationException;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
@Data
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final OrderItemRepository orderItemRepository;
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;


    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
//                .stream()
//                .map(p -> modelMapper.map(p, ProductDto.class))
//                .collect(Collectors.toList());
    }

    @Override
    public List<ProductDto> findAllByUserId(Long id) {
        return null;
    }

    @Override
    public ProductDto findById(long id) {
        return modelMapper.map(productRepository.findById(id).orElse(null), ProductDto.class);
    }

    @Override
    public ProductDto add(ProductDto dto) {
        User user = userRepository.findById(dto.getUserId()).orElse(null);
        Product product = new Product(dto.getName(), dto.getPrice(), dto.getDescription(), dto.getQuantity(), user);
        productRepository.save(product);
        return dto;
    }

    @Override
    public ProductDto add(SaveProductDto dto) throws ValidationException {
       return null;
    }

    @Override
    public ProductDto updateById(long id, ProductDto dto) {
       return null;
    }

    @Override
    public void deleteById(long id) throws ValidationException {
        List<OrderItem> orderItems = orderItemRepository.findByProductId(id);

        if (!orderItems.isEmpty())
            throw new ValidationException("Product has already been purchased");

        productRepository.deleteById(id);
    }

}

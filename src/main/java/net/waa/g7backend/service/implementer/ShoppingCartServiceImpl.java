package net.waa.g7backend.service.implementer;


import lombok.RequiredArgsConstructor;
import net.waa.g7backend.model.Product;
import net.waa.g7backend.model.ShoppingCart;
import net.waa.g7backend.model.ShoppingCartItem;
import net.waa.g7backend.model.User;
import net.waa.g7backend.model.dto.ShoppingCartDto;
import net.waa.g7backend.model.dto.ShoppingCartItemDto;
import net.waa.g7backend.repository.ProductRepository;
import net.waa.g7backend.repository.UserRepository;
import net.waa.g7backend.service.interfaces.ShoppingCartService;
import net.waa.g7backend.repository.ShoppingCartRepository;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;


@Service
@RequiredArgsConstructor
public class ShoppingCartServiceImpl implements ShoppingCartService {

    private final ShoppingCartRepository shoppingCartRepository;
    private final ProductRepository productRepository;
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;


    @Override
    public ShoppingCartDto findCart() {
     return  null;
    }

    @Override
    public ShoppingCartDto updateCart(ShoppingCartDto dto) {
        return null;
    }

    @Override
    public List<ShoppingCartItemDto> findAllItems() {
         return  null;
    }

    @Override
    public ShoppingCartItemDto findItemById(long id) {
        return null;
    }

    @Override
    public ShoppingCartItemDto addItem(ShoppingCartItemDto dto) {
        return null;
    }

    @Override
    public ShoppingCartItemDto updateItemById(long id, ShoppingCartItemDto dto) {
        return null;
    }

    @Override
    public void deleteItemById(long id) {
        shoppingCartRepository.deleteById(id);
    }

    @Override
    public ShoppingCartDto addShoppingCart(ShoppingCartDto shoppingCartDto) {
        User user = userRepository.getById(shoppingCartDto.getUserId());
        ShoppingCart shoppingCart = new ShoppingCart(user, new HashSet<>());
        for(Long item : shoppingCartDto.getItems().keySet()){
            Product product = productRepository.getById(item);
            ShoppingCartItem sci = new ShoppingCartItem(shoppingCartDto.getItems().get(item), product);
            shoppingCart.getItems().add(sci);
        }
        shoppingCartRepository.save(shoppingCart);
        return shoppingCartDto;
    }
}
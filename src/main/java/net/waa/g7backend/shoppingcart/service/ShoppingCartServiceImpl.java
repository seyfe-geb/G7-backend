package net.waa.g7backend.shoppingcart.service;


import lombok.RequiredArgsConstructor;
import net.waa.g7backend.shoppingcart.dto.ShoppingCartDto;
import net.waa.g7backend.shoppingcart.dto.ShoppingCartItemDto;
import net.waa.g7backend.shoppingcart.model.ShoppingCart;
import net.waa.g7backend.shoppingcart.model.ShoppingCartItem;
import net.waa.g7backend.shoppingcart.repository.ShoppingCartRepository;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ShoppingCartServiceImpl implements ShoppingCartService {

    private final ShoppingCartRepository repository;
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
         repository.deleteById(id);
    }
}
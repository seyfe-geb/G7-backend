package net.waa.g7backend.service.implementer;


import lombok.RequiredArgsConstructor;
import net.waa.g7backend.service.interfaces.ShoppingCartService;
import net.waa.g7backend.shoppingcart.dto.ShoppingCartDto;
import net.waa.g7backend.shoppingcart.dto.ShoppingCartItemDto;
import net.waa.g7backend.repository.ShoppingCartRepository;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import java.util.List;

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
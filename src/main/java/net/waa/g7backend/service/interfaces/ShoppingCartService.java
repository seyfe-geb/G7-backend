package net.waa.g7backend.service.interfaces;

import net.waa.g7backend.shoppingcart.dto.ShoppingCartDto;
import net.waa.g7backend.shoppingcart.dto.ShoppingCartItemDto;
import net.waa.g7backend.shoppingcart.model.ShoppingCart;

import java.util.List;

public interface ShoppingCartService {

    ShoppingCartDto findCart();

    ShoppingCartDto updateCart(ShoppingCartDto dto);

    List<ShoppingCartItemDto> findAllItems();
    ShoppingCartItemDto findItemById(long id);

    ShoppingCartItemDto addItem(ShoppingCartItemDto dto);
    ShoppingCartItemDto updateItemById(long id,ShoppingCartItemDto dto);

    void deleteItemById(long id);

}

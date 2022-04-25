package net.waa.g7backend.service.interfaces;



import net.waa.g7backend.model.dto.ShoppingCartDto;
import net.waa.g7backend.model.dto.ShoppingCartItemDto;

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

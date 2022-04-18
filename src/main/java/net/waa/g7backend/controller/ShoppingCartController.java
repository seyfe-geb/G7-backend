package net.waa.g7backend.controller;

import lombok.RequiredArgsConstructor;
import net.waa.g7backend.model.dto.ShoppingCartDto;
import net.waa.g7backend.model.dto.ShoppingCartItemDto;
import net.waa.g7backend.service.interfaces.ShoppingCartService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/v1/shoppingcarts")
@RequiredArgsConstructor
public class ShoppingCartController {

    private final ShoppingCartService shoppingCartService;

    @GetMapping
    public ShoppingCartDto get() {
        return shoppingCartService.findCart();
    }

    @GetMapping("/items")
    public List<ShoppingCartItemDto> getAll() {
        return shoppingCartService.findAllItems();
    }

    @GetMapping("/item/{id}")
    public ShoppingCartItemDto getItem(@PathVariable long id) {
        return shoppingCartService.findItemById(id);
    }

    @PostMapping("/item")
    public ShoppingCartItemDto addItem(@RequestBody ShoppingCartItemDto dto){
        return shoppingCartService.addItem(dto);
    }

    @PutMapping("/item/{id}")
    public ShoppingCartItemDto updateItem(@PathVariable long id, @RequestBody ShoppingCartItemDto dto){
        return shoppingCartService.updateItemById(id, dto);
    }

    @DeleteMapping("/item/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteItem(@PathVariable long id){
        shoppingCartService.deleteItemById(id);
    }
}

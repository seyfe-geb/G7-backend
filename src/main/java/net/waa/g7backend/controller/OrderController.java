package net.waa.g7backend.controller;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import net.waa.g7backend.model.Order;
import net.waa.g7backend.service.interfaces.OrderService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequiredArgsConstructor
@Data
@RequestMapping("/api/v1/orders")
public class OrderController {

    private final OrderService orderService;

    @GetMapping
    public List<Order> getAll(){
        return orderService.findAll();
    }
}

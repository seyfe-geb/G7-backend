package net.waa.g7backend.order.controller;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import net.waa.g7backend.service.interfaces.OrderService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequiredArgsConstructor
@Data
@RequestMapping("/api/v1/orders")
public class OrderController {

    private final OrderService orderService;
}

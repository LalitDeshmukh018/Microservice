package com.LalitDK018_ECommerce.order_service.Controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LalitDK018_ECommerce.order_service.Dto.OrdersRequestDto;
import com.LalitDK018_ECommerce.order_service.Service.OrdersService;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
@Slf4j
public class OrderController {
     
    private final OrdersService ordersService;

    @GetMapping
    public ResponseEntity<List<OrdersRequestDto>> getAllOrders(HttpServletRequest HttpServletRequest){
        log.info("Getting all orders");
        List<OrdersRequestDto> orders = ordersService.getAllOrders();
        return ResponseEntity.ok(orders);
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrdersRequestDto> getOrderById(@PathVariable Long id){
        log.info("getting order eith the help of id");
        OrdersRequestDto orders = ordersService.getOrderById(id);
        return ResponseEntity.ok(orders);
    }
}

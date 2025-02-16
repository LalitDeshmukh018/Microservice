package com.LalitDK018_ECommerce.order_service.Service;

import java.util.List;


import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.LalitDK018_ECommerce.order_service.Dto.OrdersRequestDto;
import com.LalitDK018_ECommerce.order_service.Entity.Orders;
import com.LalitDK018_ECommerce.order_service.Repository.OrderRepositroy;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service 
@RequiredArgsConstructor
@Slf4j
public class OrdersService {
    
    private final OrderRepositroy orderRepositroy;
    private final ModelMapper modelMapper;

    public List<OrdersRequestDto> getAllOrders(){
        log.info("getting all the orders");
        List<Orders> orders = orderRepositroy.findAll();
        return orders.stream().map(order -> modelMapper.map(orders,OrdersRequestDto.class)).toList();
    }

    public OrdersRequestDto getOrderById(Long id){
        log.info("Getting order by id");
        Orders orders = orderRepositroy.findById(id).
        orElseThrow(()-> new RuntimeException("Not found"));
        return modelMapper.map(orders, OrdersRequestDto.class);
    }
    
}

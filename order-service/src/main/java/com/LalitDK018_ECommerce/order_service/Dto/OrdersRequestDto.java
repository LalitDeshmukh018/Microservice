package com.LalitDK018_ECommerce.order_service.Dto;

import java.math.BigDecimal;
import java.util.List;

import lombok.Data;

@Data
public class OrdersRequestDto {
    private Long id; 
    private List<OrderRequestItemsDto> items;
    private BigDecimal totalPrice;
    
}

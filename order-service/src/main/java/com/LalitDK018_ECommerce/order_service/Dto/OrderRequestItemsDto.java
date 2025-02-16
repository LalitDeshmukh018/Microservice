package com.LalitDK018_ECommerce.order_service.Dto;

import lombok.Data;

@Data
public class OrderRequestItemsDto {
    private Long id ;
    private Long productid;
    private Integer quantity;
}

package com.LalitDK018_ECommerce.order_service.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LalitDK018_ECommerce.order_service.Entity.Orders;

public interface OrderRepositroy extends JpaRepository<Orders,Long> {

    
}

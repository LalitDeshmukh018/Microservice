package com.LalitDK018_ECommerce.inventory_service.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.LalitDK018_ECommerce.inventory_service.Entity.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product,Long>{
    
}

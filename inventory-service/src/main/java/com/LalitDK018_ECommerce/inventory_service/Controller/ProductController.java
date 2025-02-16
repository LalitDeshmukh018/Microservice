package com.LalitDK018_ECommerce.inventory_service.Controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LalitDK018_ECommerce.inventory_service.Dto.ProductDto;
import com.LalitDK018_ECommerce.inventory_service.Service.ProductService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {
    

    private final ProductService productService;

    @GetMapping
    public ResponseEntity<List<ProductDto>> getAllInventory(){
        List<ProductDto> inventories = productService.getAllInventory();
        return ResponseEntity.ok(inventories);
    }

    @PostMapping("/{id}")
    public ResponseEntity<ProductDto> getInventoryById(@PathVariable Long id){
        ProductDto inventory = productService.getProductById(id);
        return ResponseEntity.ok(inventory);
    }
  
    }
    


package com.LalitDK018_ECommerce.inventory_service.Service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.LalitDK018_ECommerce.inventory_service.Dto.ProductDto;
import com.LalitDK018_ECommerce.inventory_service.Entity.Product;
import com.LalitDK018_ECommerce.inventory_service.Repository.ProductRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;
    private final ModelMapper modelMapper;

    public List<ProductDto> getAllInventory(){
        log.info("Fetching all items");
        List<Product> inventories =  productRepository.findAll();
        return inventories.stream()
        .map(product -> modelMapper.map(product,ProductDto.class))
        .toList();
    }

    public ProductDto getProductById (Long id){
        log.info("Fetching the product with the help of id");
        Optional<Product> inventory = productRepository.findById(id);
        return inventory.map(item-> modelMapper.map(item , ProductDto.class))
        .orElseThrow(()-> new RuntimeException("Not found "));
    }
}

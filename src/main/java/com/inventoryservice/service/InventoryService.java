package com.inventoryservice.service;

import com.inventoryservice.repository.InventoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class InventoryService {

    private final InventoryRepository inventoryRepository;

    public Boolean isInStock(String skuCode){
       return inventoryRepository.findBySkuCode(skuCode).isPresent();
    }

}

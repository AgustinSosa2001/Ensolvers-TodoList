package com.project.spa.services;

import java.util.List;

import com.project.spa.entitys.Item;
import com.project.spa.repositories.ItemRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {
    
    @Autowired
    private ItemRepository itemRepository;

    public List<Item> getAllItems(){
        return itemRepository.findAll();
    }

    public Item createItem(Item item){
        return itemRepository.save(item);
    }

    public boolean deleteItem(Long id){
        try{
            itemRepository.deleteById(id);
            return true;
        }catch(Exception e){
            return false;
        }
    }

}

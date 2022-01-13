package com.project.spa.controllers;

import com.project.spa.entitys.Item;
import com.project.spa.services.ItemService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@RestController
@RequestMapping("/tasks")
public class ItemController {
    @Bean
        public WebMvcConfigurer corsConfigurer() {
            return new WebMvcConfigurer() {
                @Override
                public void addCorsMappings(CorsRegistry registry) {
                    registry.addMapping("/**").allowedOrigins("*").allowedMethods("GET", "POST","PUT", "DELETE");
                }
            };
        }
    @Autowired
    private ItemService itemService;

    @GetMapping("")
    public java.util.List<Item> verItems(){
        return itemService.getAllItems();
    }

    @PostMapping("/create")
    public Item saveItem(@RequestBody Item item){
        return itemService.createItem(item);
    }

    @DeleteMapping("/{id}")
    public String deleteItem(@PathVariable Long id){
        boolean ok = itemService.deleteItem(id);
        if (ok){
            return "Se eliminó el item " + id;
        }else{
            return "No se eliminó el item " + id;
        }
    }


}

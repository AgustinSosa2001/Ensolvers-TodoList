package com.project.spa.repositories;

import com.project.spa.entitys.Item;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item , Long>  {
    
}

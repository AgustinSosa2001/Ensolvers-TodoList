package com.project.spa.repositories;

import com.project.spa.entitys.Folder;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder ,Long> {
    
}

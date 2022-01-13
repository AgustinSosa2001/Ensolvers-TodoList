package com.project.spa.services;

import java.util.List;

import com.project.spa.entitys.Folder;
import com.project.spa.repositories.FolderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FolderService {

    @Autowired
    private FolderRepository folderRepository;

    public List<Folder> getAllFolders(){
        return folderRepository.findAll();
    }

    public Folder createFolder(Folder folder){
        return folderRepository.save(folder);
    }

    public boolean deleteFolder(Long id){
        try {
            folderRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
        
    }
}

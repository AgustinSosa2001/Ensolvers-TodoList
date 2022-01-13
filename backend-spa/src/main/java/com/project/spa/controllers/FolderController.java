package com.project.spa.controllers;

import java.util.List;

import com.project.spa.entitys.Folder;
import com.project.spa.services.FolderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/folder")
@CrossOrigin("*")
public class FolderController {
    
    @Autowired
    private FolderService folderService;

    @GetMapping()
    public List<Folder> getFolders(){

        return folderService.getAllFolders();
    }

    @PostMapping()
    public Folder createFolder(@RequestBody Folder folder){
        return folderService.createFolder(folder);
    }

    @DeleteMapping("/{id}")
    public String deleteFolder(@PathVariable Long id){
        boolean ok= folderService.deleteFolder(id);
        if (ok){
            return "Se eliminó la carpeta" + id;
        }else{
            return "No se eliminó la carpeta" + id;
        }
    }

}

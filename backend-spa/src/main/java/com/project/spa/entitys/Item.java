package com.project.spa.entitys;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "item")
public class Item {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    private String task;

    @JoinColumn(name = "id_folder")
    @ManyToOne(cascade = CascadeType.ALL, optional = true)
    private Folder folder;

    public String getTask() {
        return this.task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public Folder getFolder() {
        return this.folder;
    }

    public void setFolder(Folder folder) {
        this.folder = folder;
    }

    public void addFolder(Folder folder){
        if (!this.folder.equals(folder)){
            this.folder = folder;
            folder.addItem(this);
        }
    }

    public void removeFolder(Folder folder){
        if (this.folder != null){
            this.folder = null;
            folder.removeItem(this);
        }
    }


}

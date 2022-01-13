package com.project.spa.entitys;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "folder")
public class Folder {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    private String title;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "folder")
    private List<Item> items = new ArrayList<>();

    public Long getId() {
        return this.Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public List<Item> getItems() {
        return this.items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    } 

    
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addItem(Item item){
        if (!this.items.contains(item)){
            items.add(item);
            item.addFolder(this);
        }
    }

    public void removeItem(Item item){
        if (this.items.contains(item)){
            items.remove(item);
            item.setFolder(null);
        }
    }



}

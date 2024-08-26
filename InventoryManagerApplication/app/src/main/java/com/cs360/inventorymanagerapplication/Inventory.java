package com.cs360.inventorymanagerapplication;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.HashMap;
import java.util.Map;

@Entity(tableName = "inventories")
public class Inventory {
    @ColumnInfo(name = "name")
    private String name;
    @PrimaryKey(autoGenerate = true)
    private Long id;
    private Map<Long, Item> items;

    //constructor
    public Inventory(String name){
        this.name = name;
        this.items = new HashMap<>();
    }

    public void addItem(Item item){
        items.put(item.getId(), item);
    }

    public void deleteItem(String id){
        items.remove(id);
    }

    public Item getItem(String id){
        return items.get(id);
    }

    public void updateQuantity(String id, int newQuantity){
        Item targetItem = items.get(id);
        if (targetItem != null){
            targetItem.setQuantity(newQuantity);
        }
    }

    public void updateDescription(String id, String newDescription){
        Item targetItem = items.get(id);
        if (targetItem != null){
            targetItem.setDescription(newDescription);
        }
    }

    public void updateName(String id, String newName){
        Item targetItem = items.get(id);
        if (targetItem != null){
            targetItem.setName(newName);
        }
    }
}

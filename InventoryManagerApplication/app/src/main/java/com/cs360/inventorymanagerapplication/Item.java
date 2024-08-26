package com.cs360.inventorymanagerapplication;

import androidx.annotation.NonNull;
import androidx.room.*;

@Entity(tableName = "inventory_items", foreignKeys = @ForeignKey(entity = Inventory.class,
        parentColumns = "id",
        childColumns = "inventoryId",
        onDelete = ForeignKey.CASCADE))
public class Item {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private long id;

    @ColumnInfo(name = "inventoryId")
    private int inventoryId;

    @NonNull
    @ColumnInfo(name = "quantity")
    private int quantity;

    @ColumnInfo(name = "description")
    private String description;

    @NonNull
    @ColumnInfo(name = "name")
    private String name;
    //constructor
    public Item(long id, int quantity, String description, String name){
        this.id = id;
        this.quantity = quantity;
        this.description = description;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


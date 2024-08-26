package com.cs360.inventorymanagerapplication;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "inventory_items",
        foreignKeys = @ForeignKey(entity = Inventory.class,
                parentColumns = "id",
                childColumns = "inventoryId",
                onDelete = ForeignKey.CASCADE))
public class ItemDao {
    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "inventoryId")
    private int inventoryId;

    @ColumnInfo(name = "name")
    private String name;

    @ColumnInfo(name = "quantity")
    private int quantity;

    public ItemDao(int inventoryId, String name, int quantity) {
        this.inventoryId = inventoryId;
        this.name = name;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(int inventoryId) {
        this.inventoryId = inventoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

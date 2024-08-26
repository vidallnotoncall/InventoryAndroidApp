package com.cs360.inventorymanagerapplication;

import androidx.lifecycle.LiveData;
import androidx.room.*;

import java.util.List;

@Dao
public interface InventoryDao {
    // Inventory methods
    @Query("SELECT * FROM inventories")
    LiveData<List<Inventory>> getAllInventories();

    @Insert
    long insertInventory(Inventory inventory);

    @Update
    void updateInventory(Inventory inventory);

    @Delete
    void deleteInventory(Inventory inventory);

    // InventoryItem methods
    @Query("SELECT * FROM inventory_items WHERE inventoryId = :inventoryId")
    LiveData<List<Item>> getItemsForInventory(int inventoryId);

    @Insert
    void insertItem(Item item);

    @Update
    void updateItem(Item item);

    @Delete
    void deleteItem(Item item);
}

package com.cs360.inventorymanagerapplication;

import android.app.Application;

import androidx.lifecycle.LiveData;

import java.util.List;

public class InventoryHandler {
    private InventoryDao mInventoryDao;
    private LiveData<List<Inventory>> mAllInventories;

    public InventoryHandler(Application application) {
        InventoryDatabase db = InventoryDatabase.getDatabase(application);
        mInventoryDao = db.inventoryDao();
        mAllInventories = mInventoryDao.getAllInventories();
    }

    public LiveData<List<Inventory>> getAllInventories() {
        return mAllInventories;
    }

    public LiveData<List<Item>> getItemsForInventory(int inventoryId) {
        return mInventoryDao.getItemsForInventory(inventoryId);
    }

    public void insertInventory(Inventory inventory) {
        InventoryDatabase.databaseWriteExecutor.execute(() -> {
            mInventoryDao.insertInventory(inventory);
        });
    }

    public void updateInventory(Inventory inventory) {
        InventoryDatabase.databaseWriteExecutor.execute(() -> {
            mInventoryDao.updateInventory(inventory);
        });
    }

    public void deleteInventory(Inventory inventory) {
        InventoryDatabase.databaseWriteExecutor.execute(() -> {
            mInventoryDao.deleteInventory(inventory);
        });
    }

    public void insertItem(Item item) {
        InventoryDatabase.databaseWriteExecutor.execute(() -> {
            mInventoryDao.insertItem(item);
        });
    }

    public void updateItem(Item item) {
        InventoryDatabase.databaseWriteExecutor.execute(() -> {
            mInventoryDao.updateItem(item);
        });
    }

    public void deleteItem(Item item) {
        InventoryDatabase.databaseWriteExecutor.execute(() -> {
            mInventoryDao.deleteItem(item);
        });
    }
}

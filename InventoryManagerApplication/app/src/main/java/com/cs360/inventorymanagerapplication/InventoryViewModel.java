package com.cs360.inventorymanagerapplication;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class InventoryViewModel extends AndroidViewModel {
    private InventoryHandler mRepository;
    private LiveData<List<Inventory>> mAllInventories;

    public InventoryViewModel(Application application) {
        super(application);
        mRepository = new InventoryHandler(application);
        mAllInventories = mRepository.getAllInventories();
    }

    public LiveData<List<Inventory>> getAllInventories() {
        return mAllInventories;
    }

    public LiveData<List<Item>> getItemsForInventory(int inventoryId) {
        return mRepository.getItemsForInventory(inventoryId);
    }

    public void insertInventory(Inventory inventory) {
        mRepository.insertInventory(inventory);
    }

    public void updateInventory(Inventory inventory) {
        mRepository.updateInventory(inventory);
    }

    public void deleteInventory(Inventory inventory) {
        mRepository.deleteInventory(inventory);
    }

    public void insertItem(Item item) {
        mRepository.insertItem(item);
    }

    public void updateItem(Item item) {
        mRepository.updateItem(item);
    }

    public void deleteItem(Item item) {
        mRepository.deleteItem(item);
    }
}

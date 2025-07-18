package GameMechanics;

import Backend.Models.Item;
import GameMechanics.Inventory;
import GameMechanics.People.StoreOwner;

public class Store {
    
    // Store class to manage items available for purchase
    private String storeName;
    private Inventory storeInventory;
    private Inventory playerInventory;
    private StoreOwner owner;

    public Store(String storeName) {
        this.storeName = storeName;
        this.inventory = new Inventory();
    }

    public String getStoreName() {
        return storeName;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void addItemToStore(Item item) {
        inventory.addItem(item);
    }

    public void removeItemFromStore(Item item) {
        inventory.removeItem(item);
    }
    
}

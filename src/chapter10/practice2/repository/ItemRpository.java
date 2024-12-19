package chapter10.practice2.repository;

import chapter10.practice2.entity.Item;

import java.util.Set;

public interface ItemRpository {
    void addItem(Item item);
    void removeItem(String itemId);
    Item findById(String itemId);
    Set<Item> findAll();

}

package com.model;


import java.util.List;

import org.springframework.stereotype.Component;

@Component
public interface ItemDAO {
	public void saveItem(Item item);
	public Item findItem(int id);
	public boolean deleteItem(Item item);
	public boolean updateItem(Item item);
	public List<Item> findAll();
}
package com.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ItemService {
	@Autowired
	ItemDAO itemDAOImpl;
	
	public void save(Item item)
	{
		itemDAOImpl.saveItem(item);
	}
	
	public Item find(int id) 
	{
		return itemDAOImpl.findItem(id);
	}
	
	public List<Item> getAll()
	{
		return itemDAOImpl.findAll();
	}
	
	public boolean delete(int id)
	{
		Item item=find(id);
		return itemDAOImpl.deleteItem(item);
	}
	
	public boolean update(Item item) 
	{
		return itemDAOImpl.updateItem(item);
	}
}
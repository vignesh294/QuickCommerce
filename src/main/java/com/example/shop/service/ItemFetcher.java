package com.example.shop.service;

import java.util.List;

import com.example.shop.model.Item;

public interface ItemFetcher {
	
	public Item fetchItem(Item item);
	
	public List<Item> getAllItems();

}

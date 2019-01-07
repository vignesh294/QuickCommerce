package com.example.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shop.dao.ShopDao;
import com.example.shop.model.Item;

@Service
public class InventoryFetcher implements ItemFetcher {
	
	@Autowired
	private ShopDao shopDao;
	
	@Override
	public List<Item> getAllItems() {
		return shopDao.getWholeInventory();
	}

	@Override
	public Item fetchItem(Item item) {
		return null;
	}
	
	

}

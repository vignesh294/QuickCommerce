package com.example.shop.dao;

import java.sql.SQLException;
import java.util.List;

import com.example.shop.model.Item;
import com.example.shop.model.Order;

public interface ShopDao {

	List<Item> getWholeInventory();

	boolean placeOrderIfQtyExists(Order order) throws SQLException;

}
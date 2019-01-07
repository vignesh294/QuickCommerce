package com.example.shop.service;

import java.sql.SQLException;

import com.example.shop.model.Order;

public interface CreateOrder {

	boolean createOrderIfAvailable(String postRequest) throws SQLException;

	Order getOrderFromPostRequest(String postRequest);

}
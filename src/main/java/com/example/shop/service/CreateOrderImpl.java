package com.example.shop.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shop.dao.ShopDao;
import com.example.shop.model.Order;

@Service
public class CreateOrderImpl implements CreateOrder {
	
	@Autowired
	private ShopDao shopDao;
	
	/* (non-Javadoc)
	 * @see com.example.shop.service.CreateOrder#createOrderIfAvailable(java.lang.String)
	 */
	@Override
	public boolean createOrderIfAvailable(String postRequest) throws SQLException {
		Order order = getOrderFromPostRequest(postRequest);
		 return shopDao.placeOrderIfQtyExists(order);
	}
	
	/* (non-Javadoc)
	 * @see com.example.shop.service.CreateOrder#getOrderFromPostRequest(java.lang.String)
	 */
	@Override
	public Order getOrderFromPostRequest( String postRequest ) {
		
		// create Order object from pist request
		
		Order order = new Order();
		return order;
		
	}
	
}

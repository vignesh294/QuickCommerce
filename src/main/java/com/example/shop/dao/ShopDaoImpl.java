package com.example.shop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.shop.model.Item;
import com.example.shop.model.Order;

@Repository
public class ShopDaoImpl implements ShopDao {
	Connection conn = null;
	
	PreparedStatement pstmt = null;
    
    // for assign skills to candidate
    PreparedStatement pstmtAssignment = null;
    
    // for getting candidate id
    ResultSet rs = null;
	
	public ShopDaoImpl() {
		// code to connect to database
		// Connection conn = MySQLJDBCUtil.getConnection();
	}
	
	/* (non-Javadoc)
	 * @see com.example.shop.dao.ShopDao#getWholeInventory()
	 */
	@Override
	public List<Item> getWholeInventory() {
		// query SELECT * FROM INVENTORY;
		// Populate intolist of Items
		List<Item> inventory = new ArrayList<Item>();
		return inventory;
	}
	
	/* (non-Javadoc)
	 * @see com.example.shop.dao.ShopDao#placeOrderIfQtyExists(com.example.shop.model.Order)
	 */
	@Override
	public boolean placeOrderIfQtyExists(Order order) throws SQLException {
		conn.setAutoCommit(false);
		int qtyAvailable = getQtyFromInventory(order.getItemId());
		if(qtyAvailable >= order.getQuantity())
		{
			placeOrder(order);
			conn.commit();
			conn.setAutoCommit(true);	
			return true;
		} else {
			conn.setAutoCommit(true);	
			return false;
		}
	}
	
//	public void multDocTransctionInMongo() {
//		try (ClientSession clientSession = client.startSession()) {
//			   clientSession.startTransaction();
//			   collection.insertOne(clientSession, docOne);
//			   collection.insertOne(clientSession, docTwo);
//			   clientSession.commitTransaction();
//			}
//	}
	
	private int getQtyFromInventory(String itemId) {
		// query SELECT qty from Inventory where itemId = itemId;
		return 1;
	}
	
	private void placeOrder(Order order) {
		// query INSERT INTO Orders(orderId (pk), accountId (fk), itemId (fk), Status, quantity) values (order.etc_etc);
	}
	
	

}

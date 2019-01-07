package com.example.shop;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.shop.model.Item;
import com.example.shop.service.CreateOrder;
import com.example.shop.service.InventoryFetcher;

@Controller
@RequestMapping("/shop")
public class MainController {
	
	@Autowired
	private InventoryFetcher inventoryFetcher;
	
	@Autowired
	private CreateOrder createOrder;
	
	@RequestMapping(value = "/inventory", method = RequestMethod.GET)
	public List<Item> getAllInInventory() {
		return inventoryFetcher.getAllItems();	
	}
	
	@RequestMapping(value = "/createOrder", method = RequestMethod.POST)
	public boolean createOrder(@RequestHeader HttpHeaders headers,
			@RequestParam MultiValueMap<String, String> allRequestParams,
			@RequestBody(required = false) String postRequestBody) throws SQLException {
		return createOrder.createOrderIfAvailable(postRequestBody); //return status of order placing service later	
	}

}

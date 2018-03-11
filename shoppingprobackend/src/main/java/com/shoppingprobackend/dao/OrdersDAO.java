package com.shoppingprobackend.dao;

import java.util.List;

import com.shoppingprobackend.modal.Orders;
import com.shoppingprobackend.modal.ShippingAddress;

public interface OrdersDAO {
	boolean insertAddress(ShippingAddress shippingAddress);

	boolean insertOrders(Orders orders);

	List<Orders> getOrdersByUser(String username);
}


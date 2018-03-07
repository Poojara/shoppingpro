package com.shoppingprobackend.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;

import com.shoppingprobackend.modal.Supplier;
import com.shoppingprobackend.modal.Supplier;


public interface SupplierDAO {
	public boolean addSupplier(Supplier supplier);
	public boolean updateSupplier(Supplier  supplier);
	public boolean deleteSupplier(Supplier  supplier);
	public Supplier getSupplierById(int sid);	
	public List<Supplier> getAllSupplier();
}

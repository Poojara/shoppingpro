package com.shoppingpro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.shoppingprobackend.dao.CategoryDAO;
import com.shoppingprobackend.dao.SupplierDAO;
import com.shoppingprobackend.modal.Category;
import com.shoppingprobackend.modal.Supplier;

@Controller
public class SupplierController {
	@Autowired
	SupplierDAO supplierDAO;
	@RequestMapping("/addSupplier")
	public String addSupplier(){
	return "addSupplier";
	}
	@RequestMapping(value="/saveSupplier",method=RequestMethod.POST)
	public String saveSupplier(@RequestParam String s_Name){
	Supplier supplier=new Supplier();
	supplier.setS_Name(s_Name);
	supplierDAO.addSupplier(supplier);
	return "redirect:/viewSupplier";
	}
	@RequestMapping(value="/deleteSupplier/{cid}")
	public String deleteSupplier(@PathVariable int sid){
	Supplier supplier=supplierDAO.getSupplierById(sid);
	supplierDAO.deleteSupplier(supplier);
	return "redirect:/viewSupplier";
	} 
	@RequestMapping("/viewSupplier")
	public ModelAndView viewSupplier(){
	ModelAndView m=new ModelAndView("viewSupplier");
	List<Supplier> list=supplierDAO.getAllSupplier();
	m.addObject("supList",list);
	return m;
	}

}

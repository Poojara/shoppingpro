package com.shoppingpro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.shoppingprobackend.dao.ProductDAO;

@Controller
public class usercontroller {
@Autowired
ProductDAO productDAO;

@RequestMapping("/viewProductDetails/{id}")
public ModelAndView getProductDetails(@PathVariable int id) {
 ModelAndView m=new ModelAndView("viewProductDetails");
 m.addObject("pro",productDAO.getProduct(id));
 return m;
	
}
}

package com.shoppingpro.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.shoppingprobackend.modal.Category;
import com.shoppingprobackend.modal.Product;
import com.shoppingprobackend.modal.Supplier;


@Controller
public class ProductController {
@Autowired
com.shoppingprobackend.dao.ProductDAO productDAO;
@Autowired
com.shoppingprobackend.dao.SupplierDAO supplierDAO;
@Autowired
com.shoppingprobackend.dao.CategoryDAO categoryDAO;

@RequestMapping("/addProduct")
public ModelAndView addProduct(@ModelAttribute com.shoppingprobackend.modal.Product product){
	ModelAndView m=new ModelAndView("addProduct");
	List<com.shoppingprobackend.modal.Category> c_list=categoryDAO.getAllCategory();
	List<com.shoppingprobackend.modal.Supplier> s_list=supplierDAO.getAllSupplier();
	m.addObject("c_list",c_list);
	m.addObject("s_list",s_list);
	return m;
}
@RequestMapping(value="/saveProduct",method=RequestMethod.POST)
public String saveProduct(@ModelAttribute com.shoppingprobackend.modal.Product  product,HttpSession httpSession){
	productDAO.insertOrUpdateProduct(product);
	MultipartFile image=product.getImage();
	String path=httpSession.getServletContext().getRealPath("/resources/proImage/");
	if(!image.isEmpty()){
		File f=new File(path+product.getId()+".jpg");
		try{
			byte[] buff=image.getBytes();
			BufferedOutputStream bout=new BufferedOutputStream(new FileOutputStream(f));
			bout.write(buff);
			bout.close();
		}catch(Exception e){}
	}
	return "redirect:/viewProduct";
} 

@RequestMapping("/viewProduct")
public ModelAndView viewProduct(){
	ModelAndView m=new ModelAndView("viewProduct");
	List<Product> list=productDAO.getAllProducts();
	m.addObject("p_list",list);
	return m;
}
@RequestMapping("/updateProductbyid/{id}")
public ModelAndView updateProduct(@PathVariable int id){
	ModelAndView m=new ModelAndView("updateProduct");
	List<Category> c_list=categoryDAO.getAllCategory();
	List<Supplier> s_list=supplierDAO.getAllSupplier();
	m.addObject("c_list",c_list);
	m.addObject("s_list",s_list);
	m.addObject("product",productDAO.getProduct(id));
	return m;
}


@RequestMapping("/deleteProduct/{id}")
public ModelAndView deleteProduct(@PathVariable int id){
	ModelAndView m=new ModelAndView("redirect:/viewProduct");
	productDAO.deleteProduct(productDAO.getProduct(id));
	return m;
}

}

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
import com.shoppingprobackend.modal.Category;

@Controller
public class CategoryController {
@Autowired
CategoryDAO categoryDAO;
@RequestMapping("/addCategory")
public String addSupplier(){
return "addCategory";
}
@RequestMapping(value="/saveCategory",method=RequestMethod.POST)
public String saveCategory(@RequestParam String c_Name){
Category category=new Category();
category.setC_Name(c_Name);
categoryDAO.addCategory(category);
return "redirect:/viewCategory";
}
@RequestMapping(value="/deleteCategory/{cid}")
public String deleteCategory(@PathVariable int cid){
Category category=categoryDAO.getCategoryById(cid);
categoryDAO.deleteCategory(category);
return "redirect:/viewCategory";
} 
@RequestMapping("/viewCategory")
public ModelAndView viewCategory(){
ModelAndView m=new ModelAndView("viewCategory");
List<Category> list=categoryDAO.getAllCategory();
m.addObject("catList",list);
return m;
}
}









	


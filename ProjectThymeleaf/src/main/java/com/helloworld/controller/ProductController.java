package com.helloworld.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.helloworld.entity.Product;
import com.helloworld.entity.ProductType;
import com.helloworld.form.OrderForm;
import com.helloworld.form.ProductListForm;
import com.helloworld.service.ProductService;
import com.helloworld.service.ProductTypeService;

@Controller
public class ProductController {

	@Autowired
	private ProductTypeService productTypeService;

	@Autowired
	private ProductService productService;
	
	private ProductListForm productListForm = new ProductListForm();
	
	private OrderForm orderform = new OrderForm();
	
	private List<ProductType> productTypes = null;
	
	//ds product
	private List<Product> products = null;
	
	@GetMapping("/")
	public String index(Model model) {
		productTypes = productTypeService.findAllProductType();
		products = productService.findAll();
		model.addAttribute("productTypes", productTypes);
		model.addAttribute("productListForm", productListForm);
		model.addAttribute("products", products);	
		model.addAttribute("orderform", orderform);
		return "index";
	}
	
	@RequestMapping(value = "/search", method = RequestMethod.POST)
	public String search(ProductListForm productListForm, Model model) {
		String productName = productListForm.getProductName();
		String productType = productListForm.getProductType();
		String description = productListForm.getDescription();
		if(productName != null && productName.length() > 0) {
			productListForm.setProductName(productName);
		}
		if(productType != null && productType.length() > 0) {
			productListForm.setProductType(productType);
		}
		if(description != null && description.length() > 0) {
			productListForm.setDescription(description);
		}
		model.addAttribute("productListForm", productListForm);
		model.addAttribute("productTypes", productTypes);
		return "index";
	}
	
	@RequestMapping(value = "/order", method = RequestMethod.POST)
	public String order(@ModelAttribute("orderForm") ArrayList<OrderForm> orderForm,Model model) {
//		model.addAttribute("products", products);
		return "order";
	}
}

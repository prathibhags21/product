package com.prod.app.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.Gson;
import com.prod.app.dto.ProductDTO;
import com.prod.app.service.CategoryService;

@Controller
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	public CategoryController() {
		System.out.println("category controller created"+this.getClass().getSimpleName());
	}
	
     
	@ResponseBody
	@RequestMapping(value = {"/products/{category}"}, method = RequestMethod.POST)
	public String getByCategory(@PathVariable String category)
	 
	{
		
		List<Map<String, String>> productlist = new ArrayList<Map<String, String>>();
		String json = null;
		try{
			
			Gson gson = new Gson();
			System.out.println("inside category controller"+category);
			
			productlist = categoryService.getByCategory(category);	
			 json = gson.toJson(productlist);
		}
		
		catch (Exception e) {
			
			e.printStackTrace();
		}
		
	
		System.err.println("endinggg");
	     return json ;
		
	}
		
	}

package com.prod.app.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prod.app.dao.CategoryDAO;
import com.prod.app.dto.ProductDTO;
import com.prod.app.service.CategoryService;

@Service("CategoryService")
public class CategoryServiceImpl implements CategoryService{
   
	@Autowired
	private CategoryDAO dao;
	
	public CategoryServiceImpl() {
		System.out.println("categoryserviceimpl created"+this.getClass().getSimpleName());
	}
	
	
	public List<Map<String, String>> getByCategory(String category) {
		System.out.println("category: " + category);
		return dao.getByCategory(category);
	}
}

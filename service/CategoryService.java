package com.prod.app.service;

import java.util.List;
import java.util.Map;

import com.prod.app.dto.ProductDTO;

public interface CategoryService {
	
	
	public List<Map<String, String>> getByCategory(String  category);

}

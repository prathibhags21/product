package com.prod.app.dao;

import java.util.List;
import java.util.Map;

import com.prod.app.dto.ProductDTO;

public interface CategoryDAO {
	
	
	public List<Map<String, String>> getByCategory(String  category);

}

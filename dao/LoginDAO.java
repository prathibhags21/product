package com.prod.app.dao;

import java.util.List;
import java.util.Map;

import com.prod.app.dto.UserDTO;

public interface LoginDAO {
	
	//public UserDTO login(UserDTO dto();
	
	public List<Map<String, String>> login(UserDTO dto);
	

	
		
	

}

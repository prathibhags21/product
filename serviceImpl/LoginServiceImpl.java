package com.prod.app.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prod.app.dao.LoginDAO;
import com.prod.app.dto.UserDTO;
import com.prod.app.service.LoginService;

@Service("loginService")
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private LoginDAO loginDAO;
	
	
	public LoginServiceImpl() {
		System.out.println("loginServiceImpl"+this.getClass().getSimpleName());
	}

	public List<Map<String, String>> login(UserDTO dto) {
		List<Map<String, String>> list = loginDAO.login(dto);	
	return list;	
	
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	
//	public UserDTO login(UserDTO dto) {
//        
//		UserDTO db= loginDAO.login(dto);
//		return db;
//	}

}

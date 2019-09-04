package com.prod.app.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.transform.AliasToEntityMapResultTransformer;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.prod.app.dto.UserDTO;
import com.prod.app.service.LoginService;

@Controller
@RequestMapping({"/"})
public class Logincontroller {
	
	@Autowired
    private LoginService loginService;
	
	public Logincontroller() {
		System.out.println("login controller created"+this.getClass().getSimpleName());
	}
	
	

	@RequestMapping(value = { "/" }, method = RequestMethod.GET)
	public String signup() {
	System.err.println("inside");
		return "index";

	}
	
	/*@RequestMapping(value = "Login", method = RequestMethod.GET)
	public String login1() {
	System.err.println("inside");
		return "Login";

	}
*/	
	
	
     @ResponseBody
	@RequestMapping(value = {"/login"}, method = RequestMethod.POST)
	public String login(@RequestBody UserDTO dto ,HttpServletRequest request)
	
	{
    	// String status="success";
    	// JSONObject obj=new JSONObject();
	    
			//obj.put("status",status);
		
		System.out.println("inside login controller");
		System.out.println(dto.toString());
		
		List<Map<String, String>> finalobj = loginService.login(dto);
		
		System.out.println("db->" + finalobj.size());
		
		String reqParam = null;
		if (finalobj.size() > 0 ) {
	
			if (dto.getPassword().toString().equalsIgnoreCase(finalobj.get(0).get("password"))) 
			{
				System.out.println("login successfull");
				 reqParam = "{\"status\":\"success\"}";
				
			}
			
			
		else {
				System.out.println("incorrect password");
				 reqParam = "{\"status\":\"invalid password\"}";
				
			}	
			
		}	
	
		else 
		{
			System.out.println("wrong userName");
			reqParam = "{\"status\":\"invalid userName\"}";
		}
	    
		return reqParam;
	
	
	
	

	}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	
	@RequestMapping(value = "Login", method = RequestMethod.POST)
	public ModelAndView login(UserDTO dto) {
		System.out.println(dto.toString());
		System.out.println("inside login controller");
		
		UserDTO db = loginService.login(dto);
		System.out.println(db);

		if (db != null) {

			if (dto.getPassword().equals(db.getPassword())) {
				System.out.println("login successfull");
				
				
				return new ModelAndView("index", "msg", "login successfull").addObject("userss", db);
			} else {
				System.out.println("incorrect password");
				return new ModelAndView("Login", "msg", "incorrect password");
			}
		}

		else {
			System.out.println("wrong email id");
			return new ModelAndView("Login", "msg", "wrong password");
		}
	}
	
	
*/


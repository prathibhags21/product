package com.prod.app.daoImpl;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.transform.AliasToEntityMapResultTransformer;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.prod.app.daoImpl.AbstractDao;
import com.prod.app.dto.UserDTO;
import com.prod.app.dao.LoginDAO;

@Transactional
@Repository
public class LoginDAOImpl extends AbstractDao<String, UserDTO> implements LoginDAO {
	
	
	public LoginDAOImpl() {
		System.out.println("login daoImpl created"+this.getClass().getSimpleName());
	}
	
	

	public  List<Map<String, String>> login(UserDTO dto)
	{
		System.err.println("login dto   "+dto.getUserName());
		Session session = getSession();
		UserDTO db = new UserDTO();
		String sql = "select * from userss where userName =?";
		List<Map<String, String>> finallist = new ArrayList<Map<String, String>>();
		 SQLQuery qry = session.createSQLQuery(sql);
			qry.setString(0, dto.getUserName());
		
			if (qry.list().size() > 0) {
				qry.setResultTransformer(AliasToEntityMapResultTransformer.INSTANCE);
				System.err.println("final list"+qry.list());
				finallist = qry.list();
			}
			System.out.println("list   "+finallist.toString());
			return finallist;
			
		}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

//	public UserDTO login(UserDTO dto) {
//		
//		String hql="from userss  where userName=:name" ;
//		Session session = getSession();
//	   Query query = session.createQuery(hql);
//	   query.setParameter("name", dto.getUserName());
//	   UserDTO db =(UserDTO)query.uniqueResult();
//	   
//	   return db;  
//		
	
}

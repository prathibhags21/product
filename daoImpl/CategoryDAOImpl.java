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

import com.prod.app.dao.CategoryDAO;
import com.prod.app.dto.ProductDTO;
import com.prod.app.dto.UserDTO;

@Transactional
@Repository
public class CategoryDAOImpl extends AbstractDao<String, ProductDTO> implements CategoryDAO {

	
	public CategoryDAOImpl() {
		System.out.println("categoryDAOImpl created"+this.getClass().getSimpleName());
	}

	
	
	public List<Map<String, String>> getByCategory(String  category)
	{
		System.out.println("inside getCategorytytyty : " + category);
		Session session = getSession();

		List<Map<String, String>> categorylist = new ArrayList<Map<String, String>>();
		try {
			
			String sql="select * from product_table where catogary = ? ";
			SQLQuery qry = session.createSQLQuery(sql);
			qry.setString(0, category);
			System.err.println("sizee   "+qry.list().size());
			if (qry.list().size() > 0) {
				qry.setResultTransformer(AliasToEntityMapResultTransformer.INSTANCE);
				categorylist = qry.list();
				
System.err.println(""+categorylist);
			}
		} catch (Exception e) {
           e.printStackTrace();
		}

		return categorylist;	
		}
	
	

	
	
	
	
	
	
	
	
	}
	


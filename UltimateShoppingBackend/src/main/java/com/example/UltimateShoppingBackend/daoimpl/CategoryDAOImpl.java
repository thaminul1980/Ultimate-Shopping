package com.example.UltimateShoppingBackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.UltimateShoppingBackend.dao.CategoryDAO;
import com.example.UltimateShoppingBackend.dto.Category;

@Repository ("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	
	@Autowired
    private SessionFactory sessionFactory;
 
	
	private static List<Category> categories = new ArrayList<>();
	
	static {
		
		
		Category category = new Category();
		category.setId(1);
		category.setName("Television");
		category.setDescription(" This is some of television! ");
		category.setImageURL("CAT_1.png)");
		
		categories.add(category);
		
		 category = new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription(" This is some of Mobile! ");
		category.setImageURL("CAT_1.png)");
		
		categories.add(category);
		
		 category = new Category();
		category.setId(3);
		category.setName("laptop");
		category.setDescription(" This is some of Laptop! ");
		category.setImageURL("CAT_1.png)");
		
		categories.add(category);
		
		
	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		// enhanced for loop
		for (Category category : categories) {
			
			if (category.getId() == id) return category;
			
		}
		
		return null;
	}

	@Override
	@Transactional
	public boolean add(Category category) {
		
		try {
			// add the category to the database table
			
			sessionFactory.getCurrentSession().persist(category);
			
			return true;
		}
		catch (Exception ex){
			ex.printStackTrace();
			
			return false;
		}
		
		
	}

}

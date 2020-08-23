package com.example.UltimateShoppingBackend.dao;

import java.util.List;

import com.example.UltimateShoppingBackend.dto.Category;

public interface CategoryDAO {
	
	List<Category> list();
	
	Category get (int id);
}
			
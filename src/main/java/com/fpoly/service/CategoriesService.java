package com.fpoly.service;

import java.util.List;

import com.fpoly.entity.Category;

public interface CategoriesService {

	void deleteCategories(int id);
	
	Category createCategories(Category cate);
	
	Boolean exitCategories(int id);
	
	List<Category> findAllCategories();
}

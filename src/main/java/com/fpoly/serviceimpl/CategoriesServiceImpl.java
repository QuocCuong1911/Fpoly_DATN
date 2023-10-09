package com.fpoly.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fpoly.entity.Category;
import com.fpoly.repository.CategoryRepository;
import com.fpoly.service.CategoriesService;

@Service
public class CategoriesServiceImpl implements CategoriesService{

	@Autowired
	CategoryRepository categoryRepository;
	@Override
	public void deleteCategories(int id) {
		// TODO Auto-generated method stub
		categoryRepository.deleteById(id);
	}

	@Override
	public Category createCategories(Category cate) {
		// TODO Auto-generated method stub
		return categoryRepository.save(cate);
	}

	@Override
	public Boolean exitCategories(int id) {
		// TODO Auto-generated method stub
		return categoryRepository.existsById(id);
	}

	@Override
	public List<Category> findAllCategories() {
		// TODO Auto-generated method stub
		return categoryRepository.findAll();
	}

}

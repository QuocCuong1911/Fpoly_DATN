package com.fpoly.service;

public interface ProductService {
	void deleteProduct(int id);
	Boolean exitProductById(int id);
	Boolean checkEmtyCategories(int id);
}

package com.fpoly.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fpoly.entity.Category;
import com.fpoly.service.CategoriesService;
import com.fpoly.service.ProductService;

import jakarta.validation.Valid;

@RestController
@CrossOrigin("*")
@RequestMapping("/category")
public class CategoryRestController {

	@Autowired
	CategoriesService cateService;
	
	@Autowired
	ProductService productService;
	
	@GetMapping("/getall")
	public ResponseEntity<List<Category>> getAll(){
		return ResponseEntity.ok(cateService.findAllCategories());
	}
	
	@PostMapping("/create")
	public ResponseEntity<Category> createCate(@Valid @RequestBody Category cate){
		return ResponseEntity.ok(cateService.createCategories(cate));
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteCate(@PathVariable("id") String id){
		int idParse;
		try {
			idParse = Integer.parseInt(id);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Đường dẫn không hợp lệ");
		}
		
		if(!cateService.exitCategories(idParse)) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Sản phẩm không tồn tại hoặc đã bị xóa");
		}else if(!productService.checkEmtyCategories(idParse)) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Đang có sản phẩm của loại sản phẩm này");
		}
		cateService.deleteCategories(idParse);
		return ResponseEntity.ok("Xóa loại sản phẩm thành công");
	}
}

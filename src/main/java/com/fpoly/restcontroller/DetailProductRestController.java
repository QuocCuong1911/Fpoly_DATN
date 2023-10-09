package com.fpoly.restcontroller;


import com.fpoly.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.fpoly.entity.Product;
@RestController
@RequestMapping("/product")
@CrossOrigin("*")
public class DetailProductRestController {
    @Autowired
    ProductRepository productRepository;

    @GetMapping("/detail/{id}")
    public ResponseEntity<Product> getOne(@PathVariable("id") int id) {
        Product product = productRepository.findById(id).get();
        if (product != null) {
            return ResponseEntity.ok(product);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

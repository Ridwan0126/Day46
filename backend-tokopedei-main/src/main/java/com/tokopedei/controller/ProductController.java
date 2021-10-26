package com.tokopedei.controller;

import com.tokopedei.exception.ResourceNotFoundException;
import com.tokopedei.model.Product;
import com.tokopedei.model.Users;
import com.tokopedei.repository.ProductRepo;
import com.tokopedei.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/data/api/")
public class ProductController {
	
	@Autowired
	private ProductRepo productRepo;
	
	//get all data
	@GetMapping("/Product")
	public List<Product> getAllProduct(){
		return productRepo.findAll();
	}

	@GetMapping("/Product/{id}")
	public ResponseEntity<Product> getProductById(@PathVariable long id){
		Product product = productRepo.findById(id)
				.orElseThrow(()-> new ResourceNotFoundException("Product not exits with id :" + id));
		return ResponseEntity.ok(product);
	}
}

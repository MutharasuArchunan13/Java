package com.mvcpattern.mvcproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mvcpattern.mvcproject.model.SBShop;
import com.mvcpattern.mvcproject.service.ProductService;

@RestController
public class SBController {
    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    @ResponseBody
    public ResponseEntity<List<SBShop>> getStocksDetails(){
        return new ResponseEntity<>(productService.getProducts(),HttpStatus.OK) ;
    }
    
    @DeleteMapping("products/{id}")
    public ResponseEntity<String> deleteProductById(@PathVariable Long id){
        String response = productService.deleteProduct(id);
        return new ResponseEntity<>(response,HttpStatus.OK);
    }

    @PostMapping("products/product")
    public ResponseEntity<SBShop> addProduct(@RequestBody SBShop product){
        SBShop createdProduct = productService.addProduct(product);
        return new ResponseEntity<>(createdProduct,HttpStatus.CREATED);
    }
}

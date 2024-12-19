package com.mvcpattern.mvcproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvcpattern.mvcproject.DAO.ShopDAO;
import com.mvcpattern.mvcproject.model.SBShop;

@Service
public class ProductService {
    @Autowired
    private ShopDAO  shopDAO;

    public List<SBShop> getProducts(){
        List<SBShop> products = shopDAO.findAll();
        return products;
    }

    public String deleteProduct(Long id){
        // If id not present in record then won't allow to delete
        if(!shopDAO.existsById(id)){
            return "The product Not available anymore";
        }
        shopDAO.deleteById(id);
        return "The product removed from you cart";
        
    }

    // CREATE
    public SBShop addProduct(SBShop product){
        return shopDAO.save(product);
    }

}

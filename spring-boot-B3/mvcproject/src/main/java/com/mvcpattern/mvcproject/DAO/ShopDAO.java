package com.mvcpattern.mvcproject.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.mvcpattern.mvcproject.model.SBShop;

// @Component // general purpose stereo-type 
@Repository // specialized version
public interface ShopDAO  extends JpaRepository<SBShop,Long>{
    
}

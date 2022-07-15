package com.OnlineMobileStore.controllers;

import com.OnlineMobileStore.entities.MobileModel;
import com.OnlineMobileStore.exception.MobileNotFoundException;
import com.OnlineMobileStore.repository.IMobileRepository;
import com.OnlineMobileStore.service.IMobileService;
import com.OnlineMobileStore.service.MobileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/MobileModel")

public class MobileController{
    @Autowired
    MobileService mobileService;

    @PostMapping("/addMobile")
    public MobileModel addProduct(@RequestBody MobileModel product) {
        return mobileService.addMobile(product);
    }
    @GetMapping("/Mobiles")
    public List<MobileModel> findAllMobiles() {
        return mobileService.showAllMobile();
    }
    @GetMapping("/mobileById/{id}")
    public MobileModel findProductById(@PathVariable int id) {
        return mobileService.showMobileById(id);
    }

    @PutMapping("/update")
    public MobileModel updateProduct(@RequestBody MobileModel product) throws MobileNotFoundException{
        return mobileService.updateMobile(product);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id) throws MobileNotFoundException{
        return mobileService.deleteMobile(id);
    }
}

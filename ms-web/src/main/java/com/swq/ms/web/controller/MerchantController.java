package com.swq.ms.web.controller;


import com.swq.ms.service.merchant.MerchantService;
import com.swq.pojo.Merchant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/merchant")
public class MerchantController {


    @Autowired
    MerchantService merchantService;

    @PostMapping
    public void insertMerchant(@RequestBody Merchant merchant)
    {


        merchantService.insertMerchant(merchant);
        System.out.println(merchant);

    }

    @GetMapping("{id}")
    public void selectMerchantById(@PathVariable("id") long id)
    {

        Merchant merchant = merchantService.selectMerchantById(id);
        System.out.println(merchant);

    }

    @PutMapping
    public void udapteMerchant(@RequestBody Merchant merchant)
    {
        System.out.println(merchant);
        merchantService.updateMerchant(merchant);
    }

    @DeleteMapping("{id}")
    public void deleteMerchant(@PathVariable("id") long id)
    {
        merchantService.deleteMerchant(id);
    }

}

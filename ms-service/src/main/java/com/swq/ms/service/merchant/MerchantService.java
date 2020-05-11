package com.swq.ms.service.merchant;


import com.swq.pojo.Merchant;
import org.springframework.stereotype.Service;

import java.util.List;



public interface MerchantService {

    void insertMerchant(Merchant merchant); //添加商家

    Merchant selectMerchantById(long id); //根据id查询商家

    List<Merchant> selectAllMerchant(); //查询所有商家

    void updateMerchant(Merchant merchant); //更新商家信息

    void deleteMerchant(long id);//删除商家
}

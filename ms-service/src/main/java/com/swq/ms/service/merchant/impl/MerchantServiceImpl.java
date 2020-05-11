package com.swq.ms.service.merchant.impl;

import com.swq.ms.dao.merchant.MerchantMapper;
import com.swq.ms.service.merchant.MerchantService;
import com.swq.pojo.Merchant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class MerchantServiceImpl implements MerchantService {

    @Autowired
    MerchantMapper merchantMapper;

    @Override
    public void insertMerchant(Merchant merchant) {
        merchantMapper.insertMerchant(merchant);
    }

    @Override
    public Merchant selectMerchantById(long id) {
        return merchantMapper.selectMerchantById(id);
    }

    @Override
    public List<Merchant> selectAllMerchant() {
        return merchantMapper.selectAllMerchant();
    }

    @Override
    public void updateMerchant(Merchant merchant) {
        merchantMapper.updateMerchant(merchant);
    }

    @Override
    public void deleteMerchant(long id) {
        merchantMapper.deleteMerchant(id);
    }
}

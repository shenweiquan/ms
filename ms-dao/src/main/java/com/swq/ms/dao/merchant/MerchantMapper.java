package com.swq.ms.dao.merchant;

import com.swq.pojo.Merchant;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


import java.util.List;

/**
 * 商家mapper
 * @date: 5.11
 * @author : swq
 */

@Mapper
public interface MerchantMapper {

    void insertMerchant(Merchant merchant); //添加商家

    Merchant selectMerchantById(long id); //根据id查询商家

    List<Merchant> selectAllMerchant(); //查询所有商家

    void updateMerchant(Merchant merchant); //更新商家信息

    void deleteMerchant(long id);//删除商家

}

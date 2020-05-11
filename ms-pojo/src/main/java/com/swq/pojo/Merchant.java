package com.swq.pojo;

/**
 * 商家实体类
 * @date:5.11
 * @author :swq
 *
 */
public class Merchant {
    private long id; //主键
    private String merchantname; //商家名
    private String merchantaccount;//商家账号

    public String getMerchantpassword() {
        return merchantpassword;
    }

    public void setMerchantpassword(String merchantpassword) {
        this.merchantpassword = merchantpassword;
    }

    private String merchantpassword;//商家账号密码

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMerchantname() {
        return merchantname;
    }

    public void setMerchantname(String merchantname) {
        this.merchantname = merchantname;
    }

    public String getMerchantaccount() {
        return merchantaccount;
    }

    public void setMerchantaccount(String merchantaccount) {
        this.merchantaccount = merchantaccount;
    }



    @Override
    public String toString() {
        return "Merchant{" +
                "id=" + id +
                ", merchantname='" + merchantname + '\'' +
                ", merchantaccount='" + merchantaccount + '\'' +
                ", merchantpassword='" + merchantpassword + '\'' +
                '}';
    }
}

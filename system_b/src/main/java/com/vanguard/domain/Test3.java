package com.vanguard.domain;

import com.vanguard.commons.base.BaseDomain;

import javax.persistence.*;

/**
 * @Title: 测试实体3
 * @Description:
 * @Author: vanguard
 * @Version: 1.0
 * @Date: 2019/1/21
 */
@Table(name = "test3")
public class Test3 extends BaseDomain {

    private String telephone;

    private String email;

    private String address;

    /**
     * @return telephone
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * @param telephone
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }
}
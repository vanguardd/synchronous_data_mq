package com.vanguard.domain;

import com.vanguard.commons.base.BaseDomain;

import javax.persistence.Table;

/**
 * @Title: 测试实体2
 * @Description:
 * @Author: vanguard
 * @Version: 1.0
 * @Date: 2019/1/21
 */
@Table(name = "test2")
public class Test2 extends BaseDomain {

    private String subid;

    private String meid;

    private String acid;

    private String acname;

    private String number;

    private String name;

    /**
     * @return subid
     */
    public String getSubid() {
        return subid;
    }

    /**
     * @param subid
     */
    public void setSubid(String subid) {
        this.subid = subid;
    }

    /**
     * @return meid
     */
    public String getMeid() {
        return meid;
    }

    /**
     * @param meid
     */
    public void setMeid(String meid) {
        this.meid = meid;
    }

    /**
     * @return acid
     */
    public String getAcid() {
        return acid;
    }

    /**
     * @param acid
     */
    public void setAcid(String acid) {
        this.acid = acid;
    }

    /**
     * @return acname
     */
    public String getAcname() {
        return acname;
    }

    /**
     * @param acname
     */
    public void setAcname(String acname) {
        this.acname = acname;
    }

    /**
     * @return number
     */
    public String getNumber() {
        return number;
    }

    /**
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
}
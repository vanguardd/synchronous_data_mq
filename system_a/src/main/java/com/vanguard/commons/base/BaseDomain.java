package com.vanguard.commons.base;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @Descripe 基础domain
 * @Author vanguard
 * @Date: 2018/01/31
 * @Version 1.0
 *
 */
public class BaseDomain implements Serializable {

    protected static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
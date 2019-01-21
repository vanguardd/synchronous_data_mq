package com.vanguard.commons.response;


import java.io.Serializable;

/**
 * @author vanguard
 * @version 1.0
 * @descripe HttpResult 统一返回结果类
 * @date: 2018-07-09
 */
public class HttpResult implements Serializable {
	
	private static final long serialVersionUID = 1L;

	/** 返回状态码 */
	private Integer status;
	
	/** 返回信息 */
	private String message;
	
	/** 返回数据 */
	private Object data;
	
	public HttpResult(Integer status, String message) {
		super();
		this.status = status;
		this.message = message;
	}

	public HttpResult(CommonReturnCode commonReturnCode) {
		super();
		this.status = commonReturnCode.getStatus();
		this.message = commonReturnCode.getMessage();
	}

	public HttpResult(CommonReturnCode commonReturnCode, Object data) {
		super();
		this.status = commonReturnCode.getStatus();
		this.message = commonReturnCode.getMessage();
		this.data = data;
	}

	public HttpResult(Integer status, String message, Object data) {
		super();
		this.status = status;
		this.message = message;
		this.data = data;
	}


	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
}

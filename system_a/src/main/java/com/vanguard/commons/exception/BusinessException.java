package com.vanguard.commons.exception;


import com.vanguard.commons.response.ReturnCode;

/**
 * @title 自定义业务异常
 * @describe
 * @author vanguard
 * @version 1.0
 * @date 18/7/13
 */
public class BusinessException extends BaseException {

	private static final long serialVersionUID = 1L;
	
	/** 返回状态码 */
	private Integer code;
	
	public BusinessException() {
		super();
	}
	
	public BusinessException(String message) {
		super(message);
	}
	
	public BusinessException(Throwable cause) {
		super(cause);
	}
	
	public BusinessException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public BusinessException(Integer code, String message) {
		super(message);
		this.code = code;
	}
	
	public BusinessException(ReturnCode returnCode) {
		super(returnCode.getMessage());
		this.code = returnCode.getStatus();
	}
	
	public BusinessException(ReturnCode returnCode, Throwable cause) {
		super(returnCode.getMessage(), cause);
		this.code = returnCode.getStatus();
	}
	
	public BusinessException(Integer code, String message, Throwable cause) {
		super(message, cause);
		this.code = code;
	}
	
	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}
	
}

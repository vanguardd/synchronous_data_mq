package com.vanguard.commons.exception;

/**
 * @title 统一异常基类
 * @describe
 * @author vanguard
 * @version 1.0
 * @date 18/7/12
 */
public class BaseException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public BaseException() {
		super();
	}
	
	public BaseException(Throwable cause) {
		super(cause);
	}
	
	public BaseException(String message) {
		super(message);
	}
	
	public BaseException(String message, Throwable cause) {
		super(message, cause);
	}

	public BaseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}

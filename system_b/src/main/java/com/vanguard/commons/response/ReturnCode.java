package com.vanguard.commons.response;

/**
 * @title ReturnCode
 * @describe ReturnCode 统一异常返回状态码
 * @author vanguard
 * @version 1.0
 * @date 18/7/10
 */
public interface ReturnCode {

	/**
	 * 获得状态码
	 * @return
	 */
	public Integer getStatus();

	/**
	 * 获得信息
	 * @return
	 */
	public String getMessage();
	
}

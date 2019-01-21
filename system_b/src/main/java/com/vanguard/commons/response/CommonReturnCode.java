package com.vanguard.commons.response;



/**
 * @title 统一返回码
 * @describe
 * @author vanguard
 * @version 1.0
 * @date 18/7/12
 */
public enum CommonReturnCode implements ReturnCode {
	
	/** 请求失败 */
	FAILED(0, "failed"),
	/** 请求成功 */
	SUCCESS(1, "success"),
	/** 未知错误 */
	UNKNOWN_ERROR(-1, "未知错误,请联系管理员!"),
	
	/** 200请求成功 */
	OK(200, "请求成功"),
	/** 207频繁操作 */
	MULTI_STATUS(207, "频繁操作"),
	
	/** 303登录失败 */
	LOGIN_FAIL(303, "登录失败 "),
	
	/** 400请求参数出错 */
	BAD_REQUEST(400, "请求参数出错"),
	/** 401没有登录 */
	UNAUTHORIZED(401, "您未登录或者登录已超时,请先登录!"),
	/** 403没有权限 */
	FORBIDDEN(403, "没有权限"),
	/** 404找不到页面 */
	NOT_FOUND(404, "找不到页面"),
	/** 408请求超时 */
	REQUEST_TIMEOUT(408, "请求超时"),
	/** 409发生冲突 */
	CONFLICT(409, "发生冲突"),
	/** 410已被删除 */
	GONE(410, "已被删除"),
	/** 423已被锁定 */
	LOCKED(423, "已被锁定"),
	/** 424短信发送失败*/
	SEND_MESSAGE_FAILED(424, "短信发送失败"),
	
	/** 500服务器出错 */
	INTERNAL_SERVER_ERROR(500, "服务器出错");
	
	/** 返回状态码 */
	private Integer status;

	/** 返回消息 */
	private String message;
	
	private CommonReturnCode(Integer status, String message) {
		this.status = status;
		this.message = message;
	}

	@Override
	public Integer getStatus() {
		return status;
	}

	@Override
	public String getMessage() {
		return message;
	}
}

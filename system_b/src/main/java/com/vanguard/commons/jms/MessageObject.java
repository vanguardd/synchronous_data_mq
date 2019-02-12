package com.vanguard.commons.jms;

import java.io.Serializable;

/**
 * @Title: activeMQ同步数据的通用对象
 * @Description:
 * @Author: vanguard
 * @Version: 1.0
 * @Date: 2019/02/12
 */
public class MessageObject implements Serializable {

    protected static final long serialVersionUID = 1L;

    /**
     * 同步对象的名称
     */
    private String objectName;

    /**
     * 操作类型: add、update、delete
     */
    private String type;

    /**
     * 同步对象的数据
     */
    private Object data;

    public MessageObject(String objectName, String type, Object data) {
        this.objectName = objectName;
        this.type = type;
        this.data = data;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "MessageObject{" +
                "objectName='" + objectName + '\'' +
                ", type='" + type + '\'' +
                ", data=" + data +
                '}';
    }
}

package com.xing.aiprojectgenerator.common;

import com.xing.aiprojectgenerator.exception.ErrorCode;
import lombok.Data;

import java.io.Serializable;

import lombok.Data; // 使用Lombok的@Data注解自动生成getter、setter等方法
import java.io.Serializable; // 实现Serializable接口使对象可以被序列化
/**
 * 基础响应类，用于统一API返回格式
 * @param <T> 泛型类型，表示响应数据的类型
 */
@Data
public class BaseResponse<T> implements Serializable {

    private int code; // 响应状态码，通常用于表示请求处理状态

    private T data; // 响应数据，泛型类型可以适应各种数据类型

    private String message; // 响应消息，通常用于描述处理结果或错误信息

    /**
     * 构造方法，创建完整的响应对象
     * @param code 响应状态码
     * @param data 响应数据
     * @param message 响应消息
     */
    public BaseResponse(int code, T data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    /**
     * 构造方法，创建不带消息的响应对象
     * @param code 响应状态码
     * @param data 响应数据
     */
    public BaseResponse(int code, T data) {
        this(code, data, "");
    }

    /**
     * 构造方法，使用错误码创建响应对象
     * @param errorCode 错误码枚举，包含状态码和错误信息
     */
    public BaseResponse(ErrorCode errorCode) {
        this(errorCode.getCode(), null, errorCode.getMessage());
    }
}

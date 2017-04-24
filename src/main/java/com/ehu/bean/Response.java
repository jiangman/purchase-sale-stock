package com.ehu.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

/**
 * 所有的返回参数的共有属性
 * @author chenlong 2015-12-16
 *
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Response {
	/**
	 * 接口处理状态码
	 */
	private int resultCode = 200;
	/**
	 * 返回信息
	 */
    private String resultMessage = "OK";

    /**
     * 返回json数据
     */
    private Object data;

	/**
	 * 系统时间
	 */
	private Date systemTime = new Date();
}

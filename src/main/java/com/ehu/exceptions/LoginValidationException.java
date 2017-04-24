package com.ehu.exceptions;

/**
 * 自定义Token验证异常
 *
 * @author demon
 * @since
 */
public class LoginValidationException extends Exception {
	public LoginValidationException(String message) {
		super(message);
	}
}

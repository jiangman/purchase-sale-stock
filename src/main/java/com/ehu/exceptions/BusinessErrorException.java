package com.ehu.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 业务异常错误
 *
 * @author demon
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BusinessErrorException extends Exception {
    /**
     * 异常code
     */
    private String code;

    /**
     * 异常信息
     */
    private String message;
}

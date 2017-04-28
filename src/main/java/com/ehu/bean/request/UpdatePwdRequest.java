package com.ehu.bean.request;

import lombok.Data;

/**
 * write something to describe this file.
 *
 * @author demon
 * @since 2017-04-28 17:59.
 */
@Data
public class UpdatePwdRequest {
    private String oldPwd;

    private String newPwd;

    private int userId;
}

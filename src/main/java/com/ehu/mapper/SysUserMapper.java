package com.ehu.mapper;

import com.ehu.bean.request.UpdatePwdRequest;
import com.ehu.bean.response.SystemMenu;
import com.ehu.model.SysUser;
import com.ehu.util.MyMapper;

import java.util.List;

public interface SysUserMapper extends MyMapper<SysUser> {
    List<SystemMenu> getUserMenus(int userId);

    int updatePwd(UpdatePwdRequest request);
}
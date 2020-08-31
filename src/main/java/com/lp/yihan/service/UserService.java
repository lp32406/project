package com.lp.yihan.service;

import com.lp.yihan.common.result.Page;
import com.lp.yihan.common.result.ResponseResult;
import com.lp.yihan.entity.User;

import java.util.List;

/**
 * @author lp
 * @create 2020/5/30 16:07
 */
public interface UserService {
    ResponseResult insertUser(User user);

    ResponseResult listUser(Page page);
}

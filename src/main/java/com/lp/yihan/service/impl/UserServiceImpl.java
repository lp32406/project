package com.lp.yihan.service.impl;

import com.github.pagehelper.PageInfo;
import com.github.pagehelper.page.PageMethod;
import com.lp.yihan.common.result.Page;
import com.lp.yihan.common.result.ResponseResult;
import com.lp.yihan.dao.UserDao;
import com.lp.yihan.entity.User;
import com.lp.yihan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lp
 * @create 2020/5/30 16:07
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public ResponseResult insertUser(User user) {
        int insert = userDao.insert(user);
        if(insert > 0){
            return ResponseResult.sucess();
        }
        return ResponseResult.fail();
    }

    @Override
    public ResponseResult listUser(Page page) {
        PageMethod.startPage(page.getPage(),page.getLimit());
        List<User> users = userDao.selectAll();
        PageInfo<User> info = new PageInfo<>(users);
        return ResponseResult.sucess(info.getList(),info.getTotal());
    }
}

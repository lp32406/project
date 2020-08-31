package com.lp.yihan.dao;

import com.lp.yihan.entity.User;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * 用户表(User)表数据库访问层
 *
 * @author lp
 * @since 2020-05-30 15:48:49
 */
@Repository
public interface UserDao extends Mapper<User> {

}
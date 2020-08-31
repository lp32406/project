package com.lp.yihan.dao;

import com.lp.yihan.entity.Admin;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * 管理员表(Admin)表数据库访问层
 *
 * @author lp
 * @since 2020-05-30 15:48:50
 */
@Repository
public interface AdminDao extends Mapper<Admin> {

}
package com.lp.yihan.entity;

import java.util.Date;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;

/**
 * 管理员表(Admin)表实体类
 *
 * @author lp
 * @since 2020-05-30 15:48:50
 */
@Data
@ApiModel(value = "管理员表")
@Table(name = "admin")
public class Admin implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "管理员id")
    private Integer adminId;

    @ApiModelProperty(value = "姓名")    
    private String name;

    @ApiModelProperty(value = "昵称")    
    private String nickName;

    @ApiModelProperty(value = "创建时间")    
    private Date createTime;

    @ApiModelProperty(value = "修改时间")    
    private Date updateTime;

    public Admin() {
    }
}
package com.lp.yihan.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 用户表(User)表实体类
 *
 * @author lp
 * @since 2020-05-30 15:48:47
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ApiModel(value = "用户表")
@Table(name = "user")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "用户id")
    private Integer userId;

    @NotBlank(message = "用户名不能为空")
    @ApiModelProperty(value = "用户名")
    private String name;

    @NotNull(message = "性别不能为空")
    @ApiModelProperty(value = "性别：1，男  2，女")    
    private Integer gender;

    @NotNull(message = "年龄不能为空")
    @ApiModelProperty(value = "年龄")
    private Integer age;

    public User(@NotBlank(message = "用户名不能为空") String name, @NotNull(message = "年龄不能为空") Integer age) {
        this.name = name;
        this.age = age;
    }
}
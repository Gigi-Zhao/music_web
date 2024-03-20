package com.example.yin.model.domain;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Date;

@TableName(value = "consumer")
@Data
public class Consumer {

    @TableId(type = IdType.AUTO)  // 主键自增
    private Integer id;

    private String username;

    private String password;

    private Byte sex;

    private String phoneNum;

    private String email;

    private Date birth;

    private String introduction;

    private String location;

    private String avator;

    @TableField(fill = FieldFill.INSERT)        // 插入时填充
    private Date createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE) // 插入和更新时填充
    private Date updateTime;

    @Override
    public String toString() {

        return ToStringBuilder.reflectionToString(this);
    }
}

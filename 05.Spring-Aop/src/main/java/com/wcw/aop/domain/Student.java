package com.wcw.aop.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author wu
 * @create 2024/9/13 16:54
 */
@Data
@TableName("student")
public class Student implements Serializable {
    @Serial
    private static final long serialVersionUID = -339516038496531943L;
    @TableId(type = IdType.AUTO)
    private Long id;
    private String name;
    private String gender;
}

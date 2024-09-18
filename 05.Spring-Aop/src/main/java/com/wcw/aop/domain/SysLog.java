package com.wcw.aop.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

/**
 * @author wu
 * @create 2024/9/13 18:19
 */
@TableName("sys_log")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysLog implements Serializable {
    @Serial
    private static final long serialVersionUID = -6309732882044872298L;
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String username;
    private String operation;
    private Integer time;
    private String method;
    private String params;
    private String ip;
    private Date createTime;
}

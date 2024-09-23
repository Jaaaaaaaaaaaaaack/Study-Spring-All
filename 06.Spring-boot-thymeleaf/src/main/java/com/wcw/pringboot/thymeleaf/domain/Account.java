package com.wcw.pringboot.thymeleaf.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author wu
 * @create 2024/9/23 16:18
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account implements Serializable {
    private String account;
    private String name;
    private String password;
    private String accountType;
    private String tel;
}

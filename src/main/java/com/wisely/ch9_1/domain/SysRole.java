package com.wisely.ch9_1.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 用户系统角色
 * @author Lucifer
 * @date 2018/02/28 14:40
 */
@Entity
@Data
public class SysRole {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

}

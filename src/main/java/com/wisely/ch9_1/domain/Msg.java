package com.wisely.ch9_1.domain;

import lombok.Data;

/**
 * 测试不同角色的用户展示
 * @author Lucifer
 * @date 2018/02/28 14:49
 */
@Data
public class Msg {

    private String title;

    private String content;

    private String etraInfo;

    public Msg(String title, String content, String etraInfo) {
        this.title = title;
        this.content = content;
        this.etraInfo = etraInfo;
    }
}

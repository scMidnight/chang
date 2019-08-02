package com.chang.common.enums;

/**
 * @author: SunChang
 * @Date: 2019/8/2 14:23
 * @Description: 用户会话
 */
public enum OnlineStatusEnum {
    /** 用户状态 */
    on_line("在线"), off_line("离线");

    private final String info;

    private OnlineStatusEnum(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }
}

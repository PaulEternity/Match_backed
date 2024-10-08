package com.paul.usercenter.model.enums;


import lombok.Getter;
import lombok.Setter;

/**
 * 队伍状态枚举
 */
@Getter
public enum TeamStatusEnum {
    PUBLIC(0, "公开"),
    PRIVATE(1, "私有"),
    SECRET(2, "私密");


    private int value;
    private String text;

    public static TeamStatusEnum getEnumByValue(int value) {
//        if(value == null){
//            return null;
//        }
        TeamStatusEnum[] values = TeamStatusEnum.values();
        for(TeamStatusEnum teamStatusEnum : values) {
            if(teamStatusEnum.getValue() == value) {
                return teamStatusEnum;
            }
        }
        return null;

    }

    TeamStatusEnum(int value, String text) {
        this.value = value;
        this.text = text;
    }
}

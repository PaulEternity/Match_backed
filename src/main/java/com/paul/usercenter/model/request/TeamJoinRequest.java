package com.paul.usercenter.model.request;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
public class TeamJoinRequest implements Serializable {

    @Serial
    private static final long serialVersionUID = 2888955651660742222L;

    private Long teamId;

    private String password;
}

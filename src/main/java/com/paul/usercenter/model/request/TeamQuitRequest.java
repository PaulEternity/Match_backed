package com.paul.usercenter.model.request;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
public class TeamQuitRequest implements Serializable {


    @Serial
    private static final long serialVersionUID = -7223529643123402609L;

    private Long teamId;

}

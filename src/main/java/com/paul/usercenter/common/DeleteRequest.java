package com.paul.usercenter.common;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
public class DeleteRequest implements Serializable {

    @Serial
    private static final long serialVersionUID = 4430216945499630821L;

    private long id;
}

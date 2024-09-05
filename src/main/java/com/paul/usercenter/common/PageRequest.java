package com.paul.usercenter.common;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * 通用分页请求参数
 */
@Data
public class PageRequest implements Serializable {

    @Serial
    private static final long serialVersionUID = -92712166183671571L;
    /**
     * 页面大小
     */
    protected int pageSize;
    /**
     * 当前是第几页
     */
    protected int pageNum;
}

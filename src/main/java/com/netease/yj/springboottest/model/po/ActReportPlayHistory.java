/*
 * @(#)ActReportPlayHistory.java, 2019/12/13.
 * <p/>
 * Copyright 2019 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.netease.yj.springboottest.model.po;

import lombok.Getter;
import lombok.Setter;

/**
 * @author 杨杰(yangjie7 @ corp.netease.com)
 * @date 2019/12/13 10:21.
 */
@Getter
@Setter
public class ActReportPlayHistory {
    /**
     * 主键id
     */
    private long id;

    /**
     * 历史记录ID
     * <p>
     *     playId_creator_时间戳
     * </p>
     */
    private String historyId;

    /**
     * 玩法Id
     */
    private Long playId;

    /**
     * 快照json字段
     */
    private String snapshot;

    /**
     * snapshot中sku元素数量
     */
    private Integer size;

    /**
     * 更新人，即该条记录创建人
     */
    private String creator;

    /**
     * 更新时间，即该条记录创建时间
     */
    private Long createTime;

    /**
     * 修改时间（DB规范，业务不需要）
     */
    private Long updateTime;
}


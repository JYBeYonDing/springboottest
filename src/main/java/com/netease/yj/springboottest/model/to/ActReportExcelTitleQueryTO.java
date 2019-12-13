/*
 * @(#)ActReportExcelTitleQueryTO.java, 2019/12/13.
 * <p/>
 * Copyright 2019 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.netease.yj.springboottest.model.to;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author 杨杰(yangjie7 @ corp.netease.com)
 * @date 2019/12/13 14:21.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ActReportExcelTitleQueryTO {

    /**
     * 玩法id, 新建玩法时为0，大于0有效，返回已有玩法sku的状态
     */
    private long playId;

    /**
     * 活动类型一级类目
     * 1：单商品；2：多商品；6：优惠券；3：会员特殊玩法；4：积分玩法
     */
    private int type1;

    /**
     * 活动类型二级类目<p>
     * 单商品1：
     * <p>201：秒杀；204：特价；202：阶梯变价；203：限时购；100000：专享价；300000：定金购；9002001：拼团；</p>
     * 多商品2
     * <p>107：满件减；108：满额减；109：满折；106：N元任选；105：套装价</p>
     * 优惠券6
     * <p>8800000：优惠券</p>
     * 会员特殊玩法3：
     * <p>9003001：超会免费试用</p>
     * 积分玩法
     * <p>9004001：积分兑换</p>
     */
    private int type2;

    private long startTime;

    private long endTime;

    private boolean checkValid;

    /**
     * 1 p3 折扣价  2 p4折扣价
     */
    private int discountType;

    /**
     * 全局折扣值，非空且大于0有效
     */
    private BigDecimal globalDiscount;

    /**
     * 是否显示选品配置结果
     */
    private boolean displayStatus;

    /**
     * 是否显示选品配置结果
     */
    private boolean displayBuStatus;

    /**
     * 是否显示选品审核结果
     */
    private boolean displayAudit;

    /**
     * 是否显示选品关联结果
     */
    private boolean displaySelect;

    private String product;

    /**
     * 玩法内容
     */
    private String content;

    /**
     * 拥有权限的列表
     */
    private List<String> permColumnKeys;
}

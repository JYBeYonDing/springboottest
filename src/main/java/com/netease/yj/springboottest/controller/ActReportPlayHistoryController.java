/*
 * @(#)ActReportPlayHistoryController.java, 2019/12/13.
 * <p/>
 * Copyright 2019 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.netease.yj.springboottest.controller;

import com.alibaba.fastjson.JSON;
import com.netease.yj.springboottest.dao.ActReportPlayHistoryDao;
import com.netease.yj.springboottest.model.po.ActReportPlayHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author 杨杰(yangjie7 @ corp.netease.com)
 * @date 2019/12/13 10:56.
 */
@Controller
@RequestMapping("/ActReportPlayHistoryController")
public class ActReportPlayHistoryController {

    @Autowired
    private ActReportPlayHistoryDao dao;

    @RequestMapping("/get")
    @ResponseBody
    public String get() {
        System.out.println("进入到get");
        List<ActReportPlayHistory> byPlayId = dao.getHistoryListByPlayId(131);
        return JSON.toJSONString(byPlayId);
    }
}

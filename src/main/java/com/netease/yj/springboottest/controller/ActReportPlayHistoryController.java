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
import com.netease.yj.springboottest.model.to.ActReportExcelTitleQueryTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author 杨杰(yangjie7 @ corp.netease.com)
 * @date 2019/12/13 10:56.
 */
@Controller
@RequestMapping("/ActReportPlayHistoryController")
public class ActReportPlayHistoryController {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private ActReportPlayHistoryDao dao;

    @RequestMapping("/get")
    @ResponseBody
    public String get() {
        System.out.println("进入到get");
        List<ActReportPlayHistory> byPlayId = dao.getHistoryListByPlayId(131);
        return JSON.toJSONString(byPlayId);
    }

    @RequestMapping("/downloadHistory")
    public void downloadHistory(@RequestBody ActReportExcelTitleQueryTO queryParam,
                                @RequestParam(value = "historyId") Long historyId,
                                HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        /**
         * POST http://localhost:8080/ActReportPlayHistoryController/downloadHistory?historyId=1003166 HTTP/1.1
         * 加上requestbody就可以请求到
         */

//        if (logger.isDebugEnabled()) {
//            logger.debug("[op:downloadHistory] queryParam={}, historyId={}", JSON.toJSONString(queryParam), historyId);
//        }
        System.out.println("进入下载页面");
        System.out.println(JSON.toJSONString(queryParam));
        System.out.println(historyId);
//        ActReportPlayHistoryExcelExportTO exportTO = actReportItemExcelFactory
//                .buildUpHistoryExport(queryParam, historyId);
//        actReportItemExcelFactory.exportHistoryExcel(exportTO, request, response);
    }
}

/*
 * @(#)ActReportPlayHistoryDao.java, 2019/12/13.
 * <p/>
 * Copyright 2019 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.netease.yj.springboottest.dao;

import com.netease.yj.springboottest.model.po.ActReportPlayHistory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 杨杰(yangjie7 @ corp.netease.com)
 * @date 2019/12/13 10:37.
 */
@Repository
public class ActReportPlayHistoryDao {
    private final String classStr = ActReportPlayHistoryDao.class.getName();

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;
    /**
     * 按照playId查询 注：一个playId对应多个historyId，一个historyId对应多个id，
     *
     * @param playId 玩法Id
     * @return 返回玩法历史信息列表
     */
    public List<ActReportPlayHistory> getByPlayId(long playId) {
        Map<String, Object> params = new HashMap<>(1);
        params.put("playId", playId);
        return sqlSessionTemplate.selectList(classStr + ".getByPlayId", params);
    }

    /**
     * 通过historyId查询 注：一个historyId可能对应多条id
     *
     * @param historyId 玩法历史记录Id
     * @return 返回该记录的历史信息
     */
    public List<ActReportPlayHistory> getByHistoryId(long historyId) {
        Map<String, Object> params = new HashMap<>(1);
        params.put("historyId", historyId);
        return sqlSessionTemplate.selectList(classStr + ".getByHistoryId", params);
    }

    /**
     * 通过playId查询历史信息列表，不返回snapshot
     *
     * @param playId 玩法Id
     * @return 玩法历史列表，不包含snapshot
     */
    public List<ActReportPlayHistory> getHistoryListByPlayId(long playId) {
        Map<String, Object> params = new HashMap<>(1);
        params.put("playId", playId);
        return sqlSessionTemplate.selectList(classStr + ".getHistoryListByPlayId", params);
    }
}

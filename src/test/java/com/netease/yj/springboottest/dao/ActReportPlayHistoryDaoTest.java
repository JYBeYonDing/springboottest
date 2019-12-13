package com.netease.yj.springboottest.dao;


import com.netease.yj.springboottest.SpringBootTestApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author 杨杰(yangjie7 @ corp.netease.com)
 * @date 2019/12/13 10:52.
 */
@SpringBootTest(classes = {SpringBootTestApplication.class})
public class ActReportPlayHistoryDaoTest {
    @Autowired
    private ActReportPlayHistoryDao dao;

    @Test
    public void getByPlayId() {
        dao.getByPlayId(131);
    }
}

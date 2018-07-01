package com.sise.dao;

import com.sise.po.Category;
import com.sise.po.News;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
public class TestNewsDao {
    @Autowired
    private NewsDao newsDao;

    @Test
    public void findNewsById() throws Exception{
        News news = newsDao.findNewsById(1);
        System.out.println(news.toString());

    }

}

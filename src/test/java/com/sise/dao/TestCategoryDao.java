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
public class TestCategoryDao {
    @Autowired
    private CategoryDao categoryDao;

    @Test
    public void findCategoryById() throws Exception{
        Category category = categoryDao.findCategoryById(1);
        System.out.println(category.toString());
        List<News> newsList = category.getNewsList();
        for (News n :newsList){
            System.out.println(n.toString());
        }
    }

}

package com.sise.dao;

import com.sise.po.News;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsDao {
    public News findNewsById(Integer id);
}

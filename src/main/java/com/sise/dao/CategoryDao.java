package com.sise.dao;

import com.sise.po.Category;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryDao {
    public Category findCategoryById(Integer id);
}

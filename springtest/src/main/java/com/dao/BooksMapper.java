package com.dao;

import com.entity.Books;
import org.apache.ibatis.annotations.Mapper;

import java.sql.Wrapper;

@Mapper
public interface BooksMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Books record);

    int insertSelective(Books record);

    Books selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Books record);

    int updateByPrimaryKey(Books record);
}
package com.service.imp;

import com.dao.BooksMapper;
import com.entity.Books;
import com.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImp implements TestService {

    @Autowired
    private BooksMapper booksMapper;

    @Override
    public void testMapper() {
        Books books = booksMapper.selectByPrimaryKey(1);
        System.out.println(books.toString());
    }
}

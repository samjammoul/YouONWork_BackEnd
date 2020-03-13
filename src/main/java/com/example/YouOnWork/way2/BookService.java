package com.example.YouOnWork.way2;


import com.example.YouOnWork.Book;
import com.example.YouOnWork.way2.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class BookService {

@Autowired
private BookRepository bookRepository;

    @Transactional
    public List<Book> list() {
        return bookRepository.findAll();
    }




}

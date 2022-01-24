package com.api.book.BootRestBook.service;

import com.api.book.BootRestBook.dio.BookRepository;
import com.api.book.BootRestBook.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public List<Book>getAllBooks()
    {
        return (List<Book>) this.bookRepository.findAll();
    }

}

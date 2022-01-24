package com.api.book.BootRestBook.dio;

import com.api.book.BootRestBook.entity.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Integer>
{
}

package com.BMS.BookManagementSystem.service;

import com.BMS.BookManagementSystem.dto.BookDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface BookService {
    List<BookDto> getALlBooks();
   BookDto getBookByID(Long Id);
    BookDto createBook(BookDto bookDto);

    void  deleteBook(Long id);
}

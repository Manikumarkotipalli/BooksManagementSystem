package com.BMS.BookManagementSystem.service;

import com.BMS.BookManagementSystem.Mapping.Mapper;
import com.BMS.BookManagementSystem.Repository.BookRepository;
import com.BMS.BookManagementSystem.dto.BookDto;
import com.BMS.BookManagementSystem.exception.ResourceNotFound;
import com.BMS.BookManagementSystem.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookServiceImpl implements  BookService{
    @Autowired
    private BookRepository bookRepo;
    @Override
    public List<BookDto> getALlBooks() {
        List<Book> books = bookRepo.findAll();

        return books.stream().map(Mapper::mapTOBookDto ).collect(Collectors.toList());
    }

    @Override
    public BookDto getBookByID(Long Id) {
        Book book = bookRepo.findById(Id).orElseThrow(() -> new ResourceNotFound("Employee not existed with this id"+Id));
        BookDto bookDto = Mapper.mapTOBookDto(book);
        return bookDto;
    }

    @Override
    public BookDto createBook(BookDto bookDto) {
        Book book = Mapper.mapTOBook(bookDto);
        Book savedBook =bookRepo.save(book);
        BookDto bookDt= Mapper.mapTOBookDto(savedBook);

        return bookDt;
    }



    @Override
    public void  deleteBook(Long id) {
        Book book = bookRepo.findById(id).orElseThrow(()->new ResourceNotFound("This employee id doesnot exist" + id));
        bookRepo.deleteById(id);


    }
}

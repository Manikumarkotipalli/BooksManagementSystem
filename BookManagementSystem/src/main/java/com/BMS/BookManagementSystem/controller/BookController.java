package com.BMS.BookManagementSystem.controller;

import com.BMS.BookManagementSystem.dto.BookDto;
import com.BMS.BookManagementSystem.model.Book;
import com.BMS.BookManagementSystem.service.BookService;
import com.BMS.BookManagementSystem.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;
import java.util.List;

@RestController
@RequestMapping("/api")
public class BookController {
    @Autowired
    private BookServiceImpl bookService;
    @PostMapping
    public ResponseEntity<BookDto> createBook(@RequestBody BookDto bookDto){
       BookDto createdBook = bookService.createBook(bookDto);
       return new ResponseEntity<> (createdBook , HttpStatus.CREATED);
   }

   @GetMapping
   public ResponseEntity<List<BookDto>> ListAllBooks(){
       List<BookDto> books = bookService.getALlBooks();
       return ResponseEntity.ok(books);
   }
    @GetMapping("{Id}")
   public ResponseEntity<BookDto> getBookById(@PathVariable Long Id){
       BookDto bookDto = bookService.getBookByID(Id);
       return bookDto!=null ? ResponseEntity.ok(bookDto) : ResponseEntity.notFound().build();

   }
  @DeleteMapping("{Id}")
   public ResponseEntity<BookDto> deleteBook(@PathVariable Long Id){
       bookService.deleteBook(Id);
       return ResponseEntity.noContent().build();
   }
}

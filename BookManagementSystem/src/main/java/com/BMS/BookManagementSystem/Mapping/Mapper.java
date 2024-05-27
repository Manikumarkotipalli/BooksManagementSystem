package com.BMS.BookManagementSystem.Mapping;

import com.BMS.BookManagementSystem.dto.BookDto;
import com.BMS.BookManagementSystem.model.Book;

public class Mapper {
    public static BookDto mapTOBookDto(Book book){
        if (book == null){
            return null;
        }
        BookDto bookDto = new BookDto();
        bookDto.setId(book.getId());
        bookDto.setBook(book.getBook());
        bookDto.setAuthor(book.getAuthor());
        bookDto.setIsbn(book.getIsbn());

        return bookDto;
    }

   public static Book mapTOBook(BookDto bookDto){
        if(bookDto == null){
            return null;
        }
        Book book = new Book();
        book.setId(bookDto.getId());
        book.setBook(bookDto.getBook());
        book.setAuthor(bookDto.getAuthor());
        book.setIsbn(bookDto.getIsbn());

        return book;

   }


}

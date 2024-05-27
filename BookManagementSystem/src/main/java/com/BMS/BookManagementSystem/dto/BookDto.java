package com.BMS.BookManagementSystem.dto;

public class BookDto {
    private Long id;
    private String book;
    private String author;
    public BookDto(){

    }
    public BookDto(Long id, String book, String author, String isbn) {
        this.id = id;
        this.book = book;
        this.author = author;
        this.isbn = isbn;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    private String isbn;
}

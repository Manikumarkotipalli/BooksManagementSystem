package com.BMS.BookManagementSystem.Repository;

import com.BMS.BookManagementSystem.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
}

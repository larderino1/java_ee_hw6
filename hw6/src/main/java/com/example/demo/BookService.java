package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface BookService extends JpaRepository<BookDTO, Integer> {


    BookDTO save(BookDTO book);


    List<BookDTO> findAllByTitle(String title);
    List<BookDTO> findAllByIsbn(String isbn);

}


package com.app.mybook.controller;

import com.app.mybook.domain.book.Book;
import com.app.mybook.domain.book.BookRequestDTO;
import com.app.mybook.domain.book.BookResponseDTO;
import com.app.mybook.repository.BookRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("book")
public class BookController {

    @Autowired
    BookRepository repository;

    @PostMapping
    public ResponseEntity postBook(@RequestBody @Valid BookRequestDTO bookRequestDTO) {
        Book newBook = new Book(bookRequestDTO);

        this.repository.save(newBook);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity getAllBooks() {
        List<BookResponseDTO> bookList = this.repository.findAll().stream().map(BookResponseDTO::new).toList();

        return ResponseEntity.ok(bookList);
    }
}

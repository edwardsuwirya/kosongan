package com.enigmacamp.kosongan.controller;

import com.enigmacamp.kosongan.model.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class KosonganController {
    @GetMapping("/books")
    public ResponseEntity<Book> doGetAllBook() {
        return new ResponseEntity(new Book("123", "Novel"), HttpStatus.OK);
    }
}

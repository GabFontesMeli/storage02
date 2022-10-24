package com.example.storage02.service;

import com.example.storage02.model.Book;
import com.example.storage02.repository.BookRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookService implements IBookService {

    private final BookRepo bookRepo;

    @Override
    public Book findById(long id) {
        return bookRepo.findById(id).orElse(null);
    }
}

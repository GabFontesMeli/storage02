package com.example.storage02.service;

import com.example.storage02.model.Book;

public interface IBookService {
    Book findById(long id);
}

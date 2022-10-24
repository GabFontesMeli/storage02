package com.example.storage02.service;

import com.example.storage02.model.Author;

public interface IAuthorService {
    Author insert(Author author);
    Author findById(long id);
}

package com.example.storage02.service;

import com.example.storage02.dto.AuthorDTO;
import com.example.storage02.model.Author;
import com.example.storage02.repository.AuthorRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AuthorService implements IAuthorService {

    private final AuthorRepo authorRepo;

    @Override
    public Author insert(Author author) {
        author.getAddress().setAuthor(author);
        return authorRepo.save(author);
    }

    @Override
    public Author findById(long id) {
        Optional<Author> optionalAuthor = authorRepo.findById(id);

        return optionalAuthor.orElse(null);
    }

    @Override
    public void deleteById(long id) {
        authorRepo.deleteById(id);
    }

    @Override
    public AuthorDTO getById(long id) {
        return authorRepo.getById(id);
    }

    @Override
    public Author getNativeById(long id) {
        return authorRepo.getNativeById(id);
    }

    @Override
    public AuthorDTO getDtoEagle(long id) {
        return authorRepo.getDtoEagle(id);
    }
}

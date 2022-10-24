package com.example.storage02.dto;

import com.example.storage02.model.Author;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AuthorDTO {
    private String name;
    private AddressDTO address;

    public AuthorDTO(Author author) {
        this.name = author.getName();
        this.address = new AddressDTO(author.getAddress());
    }
}

package com.karankumar.booksapi.model;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Author extends BaseEntity {
    private String firstName;

    private String lastName;
}

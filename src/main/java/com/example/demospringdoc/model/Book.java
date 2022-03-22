package com.example.demospringdoc.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Book {

    private long id;

    @NotBlank
    @Size(min = 0, max = 20)
    private String tittle;

    @NotBlank
    @Size(min = 0, max = 30)
    private String author;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

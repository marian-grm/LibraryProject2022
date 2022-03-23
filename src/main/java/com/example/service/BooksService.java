package com.example.service;

import com.example.model.Books;
import com.example.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BooksService {

    @Autowired
    BooksRepository booksRepository;

    public List<Books> getBooksList(){
        return booksRepository.findAll();
    }

    public void saveBooks(Books books) {
        booksRepository.save(books);
    }

    public void deleteBooks(Books books){
        booksRepository.delete(books);
    }

    public Books findBooksById(Books books){
        return booksRepository.findById(books.getId()).get();
    }
}

package com.example.demo.servise;

import com.example.demo.entity.BookEntity;
import com.example.demo.repo.BookRepo;
import com.example.demo.responce.BookListResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    private final BookRepo repo;

    public BookService(BookRepo repo) {
        this.repo = repo;
    }
    public void save(BookEntity book){repo.save(book);}
    public void delete(Long id){repo.deleteById(id);}
    public ResponseEntity<BookListResponse> getAll(){return repo.findAll();}
}

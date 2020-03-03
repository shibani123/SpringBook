package com.aciworldwide.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aciworldwide.model.Book;


@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}

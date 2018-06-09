package com.twinspires.graphqlserver.repository;

import com.twinspires.graphqlserver.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}

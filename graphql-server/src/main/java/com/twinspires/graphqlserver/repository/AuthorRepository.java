package com.twinspires.graphqlserver.repository;

import com.twinspires.graphqlserver.model.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {
}

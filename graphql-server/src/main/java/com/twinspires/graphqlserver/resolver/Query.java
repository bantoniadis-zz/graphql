package com.twinspires.graphqlserver.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.twinspires.graphqlserver.model.Author;
import com.twinspires.graphqlserver.model.Book;
import com.twinspires.graphqlserver.repository.AuthorRepository;
import com.twinspires.graphqlserver.repository.BookRepository;

public class Query implements GraphQLQueryResolver {
    private BookRepository bookRepository;
    private AuthorRepository authorRepository;

    public Query(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    public Iterable<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    public Iterable<Author> findAllAuthors() {
        return authorRepository.findAll();
    }

    public long countBooks() {
        return bookRepository.count();
    }

    public long countAuthors() {
        return authorRepository.count();
    }
}

package com.twinspires.graphqlserver.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.twinspires.graphqlserver.model.Author;
import com.twinspires.graphqlserver.model.Book;
import com.twinspires.graphqlserver.repository.AuthorRepository;

import java.util.Optional;

public class BookResolver implements GraphQLResolver<Book> {
    private AuthorRepository authorRepository;

    public BookResolver(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Optional<Author> getAuthor(Book book) {
        return authorRepository.findById(book.getAuthor().getId());
    }
}

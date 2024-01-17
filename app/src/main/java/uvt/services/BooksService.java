package uvt.services;

import org.springframework.stereotype.Service;
import uvt.models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import uvt.repos.BooksRepository;
import uvt.repos.SectionsRepository;
import uvt.repos.AuthorsRepository;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;

import java.util.ArrayList;
import java.util.List;

@Service
@EnableAsync(proxyTargetClass = true)
public class BooksService {
    private List<Book> books = new ArrayList<>();
    private final BooksRepository bookRepository;
    private final AuthorsRepository authorRepository;

    @Autowired
    public BooksService(BooksRepository booksRepository , AuthorsRepository authorsRepository ) {
        this.bookRepository = booksRepository;
        this.authorRepository = authorsRepository;

    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book getBooksByName(String name) {
        return books.stream()
                .filter(book -> book.getTitle().equals(name))
                .findFirst()
                .orElse(null);
    }

    @Async
    public CompletableFuture<Book> addBook(Book book) {
        Book createdBook = bookRepository.save(book);
        return CompletableFuture.completedFuture(createdBook);
    }

    public void deleteBook(Integer id) {
        bookRepository.deleteById(id);
    }

    public void updateBook(Long bookId, Book updatedBookData) {
        if (bookRepository.existsById((Math.toIntExact(bookId))))
        {
            updatedBookData.setId(bookId);
            bookRepository.save(updatedBookData);

        }
    }

}
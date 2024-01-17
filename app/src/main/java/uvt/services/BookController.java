package uvt.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uvt.repos.BooksRepository;
import uvt.repos.AuthorsRepository;
import uvt.repos.SectionsRepository;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import uvt.models.*;
import uvt.commands.*;


@RestController
@RequestMapping("/books")
public class BookController {
    private final CreateBookCommand addBook;
    private final DeleteBookCommand deleteBook;
    private final UpdateBooksCommand updatedBook;
    private final GetAllBooksCommand getAllBooks;
    private final GetBooksByNameCommand getBooksByName;
    private final BooksRepository booksRepository;
    private final SectionsRepository sectionsRepository;
    private final AuthorsRepository authorsRepository;
    private final AllBooksSubject allBooksSubject;

    @Autowired
    public BookController(CreateBookCommand addBook, DeleteBookCommand deleteBook, UpdateBooksCommand updatedBook, GetAllBooksCommand getAllBooks, GetBooksByNameCommand getBooksByName, BooksRepository booksRepository, SectionsRepository sectionsRepository, AuthorsRepository authorsRepository, AllBooksSubject allBooksSubject) {
        this.addBook = addBook;
        this.deleteBook = deleteBook;
        this.updatedBook = updatedBook;
        this.getAllBooks = getAllBooks;
        this.getBooksByName = getBooksByName;
        this.booksRepository = booksRepository;
        this.sectionsRepository = sectionsRepository;
        this.authorsRepository = authorsRepository;
        this.allBooksSubject = allBooksSubject;
    }

    @GetMapping("/all")
    public List<Book> getAllBooks() {
        return getAllBooks.execute();
    }

    @PostMapping("/create")
    public CompletableFuture<Book> createBook(@RequestBody Book book) throws IOException {
        List<Author> authors = book.getAuthors();
        for (Author author : authors) {
            authorsRepository.save(author);
        }
        for (Element e : book.getSections()) {
            sectionsRepository.save((Section) e);
        }
        addBook.setBook(book);
        allBooksSubject.add(book);
        return addBook.execute();
    }


        @GetMapping("books/{name}")
        public Optional<Book> getBookById(@PathVariable String name){
            getBooksByName.setBookName(name);
            return getBooksByName.execute();
        }

        @PutMapping("/books/{id}")
        public Book updateBook(@PathVariable Integer id, @RequestBody Book updatedBook){
            updatedBook.setBook(id, updatedBook);
            return updatedBook.execute();
        }

        @DeleteMapping("/books/{id}")
        public void deleteBook(@PathVariable Integer id){
            deleteBook.setId(id);
            deleteBook.execute();
        }

    }

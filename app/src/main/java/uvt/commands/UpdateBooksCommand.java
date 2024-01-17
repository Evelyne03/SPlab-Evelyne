package uvt.commands;
import uvt.models.Book;
import uvt.services.BooksService;
import org.springframework.stereotype.Component;

@Component
public class UpdateBooksCommand implements Command<Book>{
    private final BooksService booksService;
    private Integer id;
    private Book updatedBook;

    public UpdateBooksCommand(BooksService booksService) {
        this.booksService = booksService;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUpdatedBook(Integer id, Book updatedBook) {
        this.id = id;
        this.updatedBook = updatedBook;
    }
    @Override
    public Book execute() {
        booksService.updateBook(Long.valueOf(id), updatedBook);
        return this.updatedBook;
    }

    public void setBook(Integer id, Book updatedBook) {
        this.id = id;
        this.updatedBook = updatedBook;
    }
}

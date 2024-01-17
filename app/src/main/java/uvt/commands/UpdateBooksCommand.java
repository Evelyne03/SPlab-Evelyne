package uvt.commands;
import uvt.models.Book;
import uvt.services.BooksService;

public class UpdateBooksCommand implements Command{
    private final BooksService booksService;
    private String name;
    private Book updatedBook;

    public UpdateBooksCommand(BooksService booksService) {
        this.booksService = booksService;
    }

    public void setBookName(String name) {
        this.name = name;
    }

    public void setUpdatedBook(Book updatedBook) {
        this.updatedBook = updatedBook;
    }
    @Override
    public void execute() {
        booksService.updatedBook(updatedBook);
    }
}

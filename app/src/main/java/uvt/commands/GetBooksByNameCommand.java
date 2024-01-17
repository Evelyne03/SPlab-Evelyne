package uvt.commands;

import org.springframework.stereotype.Component;
import uvt.services.BooksService;
import uvt.models.Book;
import java.util.Optional;

@Component
public class GetBooksByNameCommand implements Command<Optional<Book>>{
    private final BooksService booksService;
    private String bookName;
    public GetBooksByNameCommand(BooksService booksService) {
        this.booksService = booksService;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    @Override
    public Optional<Book> execute() {
        return Optional.ofNullable(booksService.getBooksByName(bookName));
    }
}

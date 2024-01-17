package uvt.commands;

import uvt.services.BooksService;
import uvt.models.Book;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GetAllBooksCommand implements Command<List<Book>>{
    private final BooksService booksService;
    public GetAllBooksCommand(BooksService booksService) {
        this.booksService = booksService;
    }
    @Override
    public List<Book> execute() {
        return booksService.getAllBooks();
    }

}

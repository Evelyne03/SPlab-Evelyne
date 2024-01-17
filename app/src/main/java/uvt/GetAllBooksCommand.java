package uvt;

import uvt.services.BooksService;
import uvt.models.Book;

import java.util.List;

public class GetAllBooksCommand implements Command{
    private final BooksService booksService;
    public GetAllBooksCommand(BooksService booksService) {
        this.booksService = booksService;
    }
    @Override
    public void execute() {
        booksService.getAllBooks();
        List<Book> books = booksService.getAllBooks();
        for(Book book: books){
            System.out.println(book.getTitle());
        }
    }
}

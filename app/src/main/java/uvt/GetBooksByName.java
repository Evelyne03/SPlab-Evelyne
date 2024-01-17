package uvt;

import uvt.services.BooksService;

public class GetBooksByName implements Command{
    private final BooksService booksService;
    private String bookName;
    public GetBooksByName(BooksService booksService) {
        this.booksService = booksService;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    @Override
    public void execute() {
        booksService.getBookByName(bookName);
    }
}

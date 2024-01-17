package uvt.commands;

import uvt.services.BooksService;

public class GetBooksByNameCommand implements Command{
    private final BooksService booksService;
    private String bookName;
    public GetBooksByNameCommand(BooksService booksService) {
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

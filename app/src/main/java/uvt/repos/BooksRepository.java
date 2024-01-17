package uvt.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uvt.models.Book;

@Repository
public interface BooksRepository extends JpaRepository<Book, Integer>{
}

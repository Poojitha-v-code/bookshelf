package bookshelf.example.demo;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;
    public Book create(Book book){
        return bookRepository.save(book);
    }
    public Book readById(int id){
        Optional <Book> optional=bookRepository.findById(id);
        return optional.orElse(null);
    }
    public List<Book> readAll(){
        return bookRepository.findAll();
    }
    @Transactional
    public void deleteBookById(int id){
        if(!bookRepository.existsById(id)){
            throw new RuntimeException("user not found");
        }
        bookRepository.deleteById(id);
    }
}

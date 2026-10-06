package bookshelf.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Book")
public class BookController {
    @Autowired
    BookService bookService;
    @PostMapping
    public Book create(@RequestBody Book book){
        return bookService.create(book);
    }
    @GetMapping
    public List<Book> read(){
        return bookService.readAll();
    }
    @GetMapping("/{id}")
    public Book getone(@PathVariable int id){
        return bookService.readById(id);
    }
    @DeleteMapping("/{id}")
    public void deleteuser(@PathVariable int id){
         bookService.deleteBookById(id);
    }

}

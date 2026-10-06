package bookshelf.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {
    public int getBookid() {
        return Bookid;
    }

    public void setBookid(int bookid) {
        Bookid = bookid;
    }

    @Id
    private int Bookid;

    public String getBookname() {
        return Bookname;
    }

    public void setBookname(String bookname) {
        Bookname = bookname;
    }

    private String Bookname;

    public String getBookinfo() {
        return Bookinfo;
    }

    public void setBookinfo(String bookinfo) {
        Bookinfo = bookinfo;
    }

    private String Bookinfo;
}

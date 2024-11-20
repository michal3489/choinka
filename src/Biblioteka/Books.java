package Biblioteka;
import java.util.Date;

public class Books {
    private Integer bookId;
    private String title;
    private String autor;
    private Integer Isbn;
    private Integer quantity;
    private Date dateOfEntry;

    public Books(Integer bookId, String title, String autor, int Isbn, int quantity, Date dateOfEntry){
        this.bookId = bookId;
        this.title = title;
        this.autor = autor;
        this.Isbn = Isbn;
        this.quantity = quantity;
        this.dateOfEntry = dateOfEntry;
    }
    public Integer getbookId(){return bookId;};
    public void setbookId(int getbookId){this.bookId = bookId;}

    public String gettitle(){return title;};
    public void settitle(String title) {this.title = title;};

    public String getautor(){return autor;};
    public void setautor(String autor) {this.autor = autor;};

    public Integer getIsbn(){return Isbn;};
    public void setIsbn(String title) {this.Isbn = Isbn;};

    public Integer getquantity(){return quantity;};
    public void setquantity(Integer quantity) {this.quantity = quantity;};

    public Date getdateOfEntry(){return dateOfEntry;};
    public void setdateOfEntry(Date dateOfEntry) {this.dateOfEntry = dateOfEntry;};



}









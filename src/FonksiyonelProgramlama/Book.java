package FonksiyonelProgramlama;


public class Book {

    private String author;
    private int pages;



    public Book(String author, int pages) {
        this.author = author;
        this.pages = pages;
    }

    public String getauthor() {
        return author;
    }

    public void setauthor(String author) {
        this.author= author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

}

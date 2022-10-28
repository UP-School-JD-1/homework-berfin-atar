public class Reader {

    Book book;
    String name;



    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Book getBook() {
        return book;
    }
    public void setBook(Book book) {
        this.book = book;
    }

    public void read(Book book, Reader reader) {
        System.out.println(reader.name + book.title + " kitabi okuyor." );
    }


    public void getReaderInfo(Reader reader) {

        System.out.println("Name: " + reader.name);


    }
}

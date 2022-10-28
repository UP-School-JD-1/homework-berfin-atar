public class Test {
    public static void main(String[] args) {
        try {
            Author author1 = new Author();
            author1.name = "Resat Nuri Guntekin";

            Book book1 = new Book();
            book1.title = "Yaprak Dokumu";
            book1.author = author1;
            book1.page = 200;

            Reader reader = new Reader();
            reader.name = "Berfin";
            reader.age = 24;
            reader.book = book1;


            reader.read(book1, reader);
            reader.getReaderInfo(reader);

            System.out.println(reader.getName());
        } catch (Exception e){
            System.out.println("Bilinmeyen hata");
            e.printStackTrace();
        }

    }
}

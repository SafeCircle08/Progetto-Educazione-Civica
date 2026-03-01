public class Book {
    private String title;
    private String author;
    private String year;
    private String genre;
    private int code;

    public Book() {
        title = "";
        author = "";
        genre = "";
        year = "";
        code = -9999;
    }

    public Book(String title, String author, String year, String genre, int code) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.genre = genre;
        this.code = code;
    }

    public String getTitle() { return title; }
    private String getAuthor() { return author; }
    public String getYear() { return year; }
    public String getGenre() { return genre; }
    public int getCode() { return code; }

    @Override
    public String toString() {
        return title + ";" + author + ";" + year + ";" + genre + ";" + String.valueOf(code);
    }

}

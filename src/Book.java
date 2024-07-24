public class Book {
    private String nameAuthor;
    private String titleBook;

    public Book(String nameAuthor, String titleBook) {
        this.nameAuthor = nameAuthor;
        this.titleBook = titleBook;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public String getTitleBook() {
        return titleBook;
    }

    public void setTitleBook(String titleBook) {
        this.titleBook = titleBook;
    }

    @Override
    public String toString() {
        return "livro: " + titleBook
                + " - "
                + "autor: " + nameAuthor;
    }
}

import java.util.List;

public class Department {
    private String nameDepartment;
    Book book;
    List<Book> books;

    public Department(String nameDepartment, List<Book> books) {
        this.nameDepartment = nameDepartment;
        this.books = books;
    }

    public String getNameDepartment() {
        return nameDepartment;
    }

    public void setNameDepartment(String nameDepartment) {
        this.nameDepartment = nameDepartment;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(nameDepartment).append("\n");
        for (Book b : books) {
            sb.append(b).append("\n");
        }
        return sb.toString();
    }
}

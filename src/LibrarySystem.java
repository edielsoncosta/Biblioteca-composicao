import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibrarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome da biblioteca: ");
        String nomeBiblioteca = sc.next();
        System.out.println("Quantos departamentos? ");
        int qntDepartamentos = sc.nextInt();

        List<Department> departments = new ArrayList<>();

        for (int i = 0; i < qntDepartamentos; i++) {
            System.out.println("Nome do departamento #" + (i + 1));
            String nomeDepartamento = sc.next();

            List<Book> books = new ArrayList<>();

            System.out.println("quantos livros no departamento " + nomeDepartamento);
            int qntLivros = sc.nextInt();

            for (int j = 0; j < qntLivros; j++) {
                System.out.println("Nome do livro #" + (j + 1));
                String nomeLivro = sc.next();
                System.out.println("Autor do livro #" + (j + 1));
                String nomeAutor = sc.next();

                Book book = new Book(nomeAutor, nomeLivro);
                books.add(book);
            }

            Department department = new Department(nomeDepartamento, books);
            departments.add(department);
        }

        Library library = new Library(nomeBiblioteca, departments);

        System.out.println(library);

        sc.close();
    }
}
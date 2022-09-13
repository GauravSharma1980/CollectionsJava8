package deepak.compare;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

class Book{
    private Integer id;
    private String name;
    private String author;
    private Double cost;

    public Book(Integer id, String name, String author, Double cost) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.cost = cost;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("from equals.....");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id.equals(book.id) && name.equals(book.name) && author.equals(book.author) && cost.equals(book.cost);
    }

    @Override
    public int hashCode() {
        System.out.println("from hashCode.....");
        return Objects.hash(id, name, author, cost);
    }
}

public class CompareExample {

    public static void main(String[] args) {

        Comparator<Book> sortByBookAuthor = (b1, b2) -> b1.getAuthor().compareToIgnoreCase(b2.getAuthor());
        Comparator<Book> sortByBookName = (b1, b2) -> b1.getName().compareToIgnoreCase(b2.getName());
        Comparator<Book> sortByBookAuthorComparator = Comparator.comparing(Book::getAuthor);
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book(1, "swaraj", "aarav", 100.00));
        bookList.add(new Book(3, "miracles in life", "soham", 890.00));
        bookList.add(new Book(2, "life lessons", "bavi", 109.00));
        bookList.add(new Book(5, "surya namaskar", "dinesh", 140.00));
        bookList.add(new Book(4, "wonders of life", "mitrash", 300.00));
        bookList.add(new Book(6, "skilled India", "cauri", 190.00));

        bookList.stream().sorted().forEach(book->System.out.println(book.getCost()));

        /*System.out.println("***************************************************************************************");
        bookList.stream().sorted(sortByBookAuthorComparator).forEach(student-> System.out.println(student.getAuthor()));

        System.out.println("***************************************");
        //bookList.stream().sorted(sortByBookAuthorComparator).forEach(book-> System.out.println(book.getAuthor()));


        bookList.stream()
                .sorted(sortByBookAuthorComparator
                        .thenComparing(sortByBookName)
                ).forEach(book -> System.out.println(book.getAuthor()+"****"+book.getName()));



    }*/
    }
}

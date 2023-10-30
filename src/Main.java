import java.util.*;

public class Main {
    public static void main(String[] args) {
        Person per1 = new Person("Николай", "Гоголь");
        Person per2 = new Person("Лев", "Толстой");
        Person per3 = new Person("Александр", "Пушкин");
        Book book1 = new Book("Ревизор", per1);
        Book book2 = new Book("Мертвые души", per1);
        Book book3 = new Book("Война и мир", per2);
        Book book4 = new Book("Анна Каренина", per2);
        Book book5 = new Book("Капитанская дочка", per3);
        Book book6 = new Book("Полтава", per3);
        List<Book> bookList = List.of(book1, book2, book3, book4, book5, book6);
        System.out.println(findBook(bookList));
    }

    public static Map<Person, List<String>> findBook(List<Book> list) {
        Map<Person, List<String>> oneAuthor = new HashMap<>();
        for (Book b : list) {
            Person p = b.getPerson();
            String n = b.getName();
            if (oneAuthor.containsKey(p)) {
                oneAuthor.get(p).add(b.getName());
            } else {
                List<String> s = new ArrayList<>();
                s.add(n);
                oneAuthor.put(p,s);
            }
        }
        return oneAuthor;
    }
}
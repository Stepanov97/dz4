import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Person per1 = new Person("Николай", "Гоголь");
        Person per2 = new Person("Лев", "Толстой");
        Person per3 = new Person("Александр", "Пушкин");
        List<Person> personList = new ArrayList<>();
        Book book1 = new Book("Ревизор", per1);
        Book book2 = new Book("Мертвые души", per1);
        Book book3 = new Book("Война и мир", per2);
        Book book4 = new Book("Анна Каренина", per2);
        Book book5 = new Book("Капитанская дочка", per3);
        Book book6 = new Book("Полтава", per3);
        List<Book> bookList = List.of(book1, book2, book3, book4, book5, book6);
        for (int i = 0; i < bookList.size(); i++) {
            Book k = bookList.get(i);
            Person u = k.getPerson();
            personList.add(u);
        }
        findBook(bookList);
    }
    public static void findBook(List list) {
        Map<Person, String> oneAuthor = new HashMap<>();
        for (int k = 0; k < list.size(); k++) {
            Book b = (Book) list.get(k);
            Person p = b.getPerson();
            if (oneAuthor.containsKey(p)) {
                oneAuthor.put(p, oneAuthor.get(p) + "," + b.getName());
            } else {
                oneAuthor.put(p, b.getName());
            }

        }
        System.out.println(oneAuthor);
    }
}
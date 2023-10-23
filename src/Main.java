import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Person per1 = new Person("Николай", "Гоголь");
        Person per2 = new Person("Лев", "Толстой");
        Person per3 = new Person("Александр", "Пушкин");

        List<Person> personList = List.of(per1, per2, per3);


        Book book1 = new Book("Ревизор", per1);
        Book book2 = new Book("Мертвые души", per1);
        Book book3 = new Book("Война и мир", per2);
        Book book4 = new Book("Анна Каренина", per2);
        Book book5 = new Book("Капитанская дочка", per3);
        Book book6 = new Book("Полтава", per3);

        List<Book> bookList = List.of(book1, book2, book3, book4, book5, book6);

        findBook(personList, bookList);


    }

    public static void findBook(List person, List list) {
        Map<Person, String> oneAuthor = new HashMap<>();
        for (int k = 0; k < person.size(); k++) {
            Person o = (Person) person.get(k);
            String n = "";
            for (int i = 0; i < list.size(); i++) {
                Book b = (Book) list.get(i);
                Person p = b.getPerson();
                if (p.hashCode() == o.hashCode()) {
                    n = n + " " + b.getName() + ";";

                }

            }
            oneAuthor.put(o, n);

        }
        System.out.println(oneAuthor);

    }
}
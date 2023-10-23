public class Book {
    public String name;
    public Person person;

    public Book(String name,Person person){
        this.name = name;
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    public String getName() {
        return name;
    }
}

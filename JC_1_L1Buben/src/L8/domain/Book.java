package L8.domain;

import java.util.Objects;

public class Book{
    private Human human;

    private String bookName;

    public Book(Human author, String bookName) {
        this.human = author;
        this.bookName = bookName;
    }

    public Book() {
    }

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    public String getHumanName() {return getHuman().getHumanName();}

    public String getHumanPatronym() {return getHuman().getHumanPatronym();}

    public String getHumanSurname() {return getHuman().getHumanSurname();}

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return Objects.equals(getHuman(), book.getHuman()) &&
                Objects.equals(getBookName(), book.getBookName());
    }

    @Override
    public int hashCode() {
        return 31*Objects.hash(getHuman(), getBookName());
    }

    @Override
    public String toString() {
        return "Book{" +
                "human=" + human +
                ", bookName='" + bookName + '\'' +
                '}';
    }
}

package L8.comparators;

import L8.domain.Book;

import java.util.Comparator;

public class PatronymicComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return (o1.getHumanPatronym().compareTo(o2.getHumanPatronym()));
    }
}

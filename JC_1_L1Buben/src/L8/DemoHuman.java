package L8;

import L8.comparators.NameComparator;
import L8.comparators.PatronymicComparator;
import L8.comparators.StudentsComparator;
import L8.comparators.SurnameComparator;
import L8.domain.Book;
import L8.domain.Human;
import L8.util.BookUtil;
import L8.util.HumanUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

import static L8.util.Alpphbet.vowel;

public class DemoHuman{
    public static void main(String[] args) throws IOException {

        Human human = HumanUtil.generateHuman();

        System.out.println(human);

        Book book = BookUtil.generateBook();

        System.out.println(book);

        LinkedList <Book> booksList = (LinkedList <Book>) BookUtil.generateBooks(20);

        System.out.println(booksList);

        booksList.remove(7);

        System.out.println(booksList);

        HashSet<Book> hashBooks = new HashSet<>(25);

        hashBooks.addAll(booksList);

        System.out.println(hashBooks.size());

        //добавление одинаковых книг до 25 штук с 6 одинаковыми

        for (int i = 0; i < (25 - booksList.size()) ; i++) {
            hashBooks.add(book);
        }

        //и финальный вывод размера

        System.out.println(hashBooks.size());

        System.out.println(hashBooks);

        System.out.println("________________________________________________________________________________________");

        //вывод книг с назанием, начинающимся с гласной

        Book[] booksArrayForHash = hashBooks.toArray(new Book[hashBooks.size()]);
        for (int i = 0; i < booksArrayForHash.length ; i++) {
            if (vowel(booksArrayForHash[i].getBookName().charAt(0))){
                System.out.print(booksArrayForHash[i] + " ");
            }
        }

        System.out.println("");
        System.out.println("Sets");

        System.out.println("____________________________________________________________________________________");
        System.out.println("_____________________________________________________________________________________");

        NameComparator nameComparator = new NameComparator();

        TreeSet<Book> bookTreeSet = new TreeSet<>(nameComparator);
        bookTreeSet.addAll(booksList);
        System.out.println(bookTreeSet);

        System.out.println("____________________________________________________________________________________");
        System.out.println("_____________________________________________________________________________________");

        PatronymicComparator patronymicComparator = new PatronymicComparator();

        TreeSet<Book> bookTreeSet1 = new TreeSet<>(patronymicComparator);
        bookTreeSet1.addAll(booksList);
        System.out.println(bookTreeSet1);



        System.out.println("____________________________________________________________________________________");
        System.out.println("_____________________________________________________________________________________");

        SurnameComparator surnameComparator = new SurnameComparator();

        TreeSet<Book> bookTreeSet2 = new TreeSet<>(surnameComparator);
        bookTreeSet2.addAll(booksList);
        System.out.println(bookTreeSet2);


        System.out.println("Students");

        StudentsComparator studentsComparator = new StudentsComparator();

        TreeSet<Human> students = new TreeSet<>(studentsComparator);
        students.addAll(HumanUtil.generateHumans(20));
        System.out.println(students);
        System.out.println("______________________________________________________________________");
        System.out.println("______________________________________________________________________");
        ArrayList<Human> studentsArray = new ArrayList<Human>(students);
        for (int i = 1; i < studentsArray.size();i++) {
            studentsArray.remove(i);
        }
        students.removeAll(studentsArray);
        studentsArray = null;
        System.out.println();
        System.out.println(students);












    }

}

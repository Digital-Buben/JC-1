package L8.util;

import L8.domain.Book;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class BookUtil {
    public static Book generateBook(){
        Book book = new Book();
        book.setHuman(HumanUtil.generateHuman());
        File names = new File("src/resources/BookNames");
        List<String> namesList = null;
        try{
            namesList = Files.readAllLines(Paths.get("src/resources/BookNames"));
        } catch (IOException i){
            i.printStackTrace();
        }

        int bookNamesLength = namesList.size();
        namesList = null;
        int randomBookName = (int) (Math.random() * (bookNamesLength-1) + 1);//можно было начать цикл с 1
        Scanner scanner3 = null;
        try {
            scanner3 = new Scanner(names);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < randomBookName ; i++) {
            String line = scanner3.nextLine();
            if (i == randomBookName-1){
                book.setBookName(line);
            }
        }
        scanner3.close();
        return book;
    }

    public static List<Book> generateBooks(int booksAmmount){
        LinkedList <Book> books = new LinkedList<Book>();
        for (int i = 0; i < booksAmmount ; i++) {
            books.add(i, generateBook());
        }
        return books;
    }
}

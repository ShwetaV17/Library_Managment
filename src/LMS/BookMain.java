package LMS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookMain
{

    public static void main(String[] args)
    {
        List<Book> booklist = new ArrayList<>();
       /* Book book = new Book(1,"ABC","Tikesh",100,"TwoChapter");
        Book book1 = new Book(1,"DEF","Shweta",200,"ThreeChapter");
        Book book2 = new Book(1,"GIJ","Chotu",300,"FourChapter");
        Book book3 = new Book(1,"XYZ","Bitti",400,"FiveChapter");
*/
          Book book = new Book();
        Book book1 = new Book();
        Book book2= new Book();
        Book book3 = new Book();

        book.setBookId(1);
        book.setBookName("ABC");
        book.setBookAuthor("Shweta");
        book.setBookPage(100);
        book.setBookChapter("One");

        book1.setBookId(2);
        book1.setBookName("DEF");
        book1.setBookAuthor("Bitti");
        book1.setBookPage(200);
        book1.setBookChapter("Two");

        book2.setBookId(3);
        book2.setBookName("XYZ");
        book2.setBookAuthor("Chotu");
        book2.setBookPage(300);
        book2.setBookChapter("Three");


        booklist.add(book);
        booklist.add(book1);
        booklist.add(book2);


       for(Book books: booklist)
       {
           System.out.println(books.getBookId() +" "+books.getBookName() +" "+ books.getBookAuthor() +" "+ books.getBookPage() +" "+books.getBookChapter());

       }


    }
}
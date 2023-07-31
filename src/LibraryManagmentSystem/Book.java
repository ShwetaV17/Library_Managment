package LibraryManagmentSystem;

import java.util.List;
import java.util.Scanner;

public class Book {
    private int bookId;
    private String bookName;
    private String bookAuthor;
    private int bookQuantity;

    public Book(){

    }
     //Constructor
    public Book(int bookId, String bookName, String bookAuthor, int bookQuantity) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookQuantity = bookQuantity;
    }

    //Setter//
    public void setBookId(int id) {
        this.bookId = id;
    }

    public void setBookName(String name) {
        this.bookName = name;
    }

    public void setBookAuthor(String author) {
        this.bookAuthor = author;
    }

    public void setBookQuantity(int quantity) {
        this.bookQuantity = quantity;
    }

    //Getter//
    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public int getBookQuantity() {
        return bookQuantity;
    }


    // Create addBook method which is Book type and return book (obj). set the value of book into one obj.
    // addBook method called in case 1 where we add this obj in list.
    public Book addBook()
    {
        Scanner sc = new Scanner(System.in);
        Book book = new Book();

        System.out.println("Enter the book id:");
        int id =sc.nextInt();
        book.setBookId(id);

        sc.nextLine();
        System.out.println("Enter the book name:");
        String name =sc.nextLine();
        book.setBookName(name);


        System.out.println("Enter the book author:");
        String author =sc.nextLine();
        book.setBookAuthor(author);

        System.out.println("Enter the book quantity:");
        int quantity =sc.nextInt();
        book.setBookQuantity(quantity);

        return book;
    }

    //printBooklist has made for print the booklist. List<Book> books argument passing in printBooklist method.
    public void printBooklist(List<Book> books)
    {
          for(Book book : books)
          {
             printBook(book);
          }
    }

    public void printBook(Book book)
    {

        System.out.println(book.getBookId()+ " " + book.getBookName()+ " " +book.getBookAuthor()+ " " +book.getBookQuantity());
    }

    public void updateBookQuantity(List<Book> bookQuantity)
    {
        int serialNum;
        int newQuantity;
        System.out.println("Enter the serial number of book :");
        Scanner sc = new Scanner(System.in);
        serialNum = sc.nextInt();
        System.out.println("Enter the number of book to be added :");
        newQuantity = sc.nextInt();
        for (Book book : bookQuantity) {
            if (serialNum == book.getBookId()) {

                newQuantity = book.getBookQuantity() + newQuantity;
                System.out.println("Upgraded quantity :" + newQuantity);
                book.setBookQuantity(newQuantity);
            }
        }
        new Book().printBooklist(bookQuantity);
    }

    public void SearchBook(List<Book> bookSearch)
    {
        System.out.println("             SEARCH A BOOK              ");
        System.out.println("Press 1 to search with book ID ");
        System.out.println("Press 2 to search with book author name");

        Scanner sc1 = new Scanner(System.in);
        int choose = sc1.nextInt();
        System.out.println();

        switch(choose)
        {
            case 1 :
            {
                int searchById;
                System.out.println("Enter the serial number of book :");
                searchById = sc1.nextInt();
                for (Book book : bookSearch) {
                    if (searchById == book.getBookId())
                    {
                        printBook(book);
                    }
                }
            }break;
            case 2 :
            {
                String searchByauthor;
                sc1.nextLine();
                System.out.println("Enter the author name :");
                searchByauthor = sc1.nextLine();
                for (Book book : bookSearch) {
                    if (searchByauthor.equals(book.getBookAuthor()))
                    {
                        printBook(book);
                    }
                }

            }
        }
    }

}

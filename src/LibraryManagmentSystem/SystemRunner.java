package LibraryManagmentSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SystemRunner {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Scanner sc = new Scanner(System.in);
        int option = 9;

        List<Book> booklist = new ArrayList<>();
        List<Student> studentList = new ArrayList<>();

        do {
            menu.displaymenu();
            System.out.println(Constant.USER_INPUT);
            option = sc.nextInt();

            switch (option) {
                //Add book
                case 1: {
                    //  booklist.add((new Book()).addBook()) means newBook() is obj and from this obj we are called addBook()
                    // and add into list
                    //  Book book = (new Book()).addBook();
                    //   Book book1 =  book.addBook();
                    booklist.add((new Book()).addBook());
                    new Book().printBooklist(booklist);
                }
                break;
                // Upgrade quantity of book
                case 2: {
                    new Book().updateBookQuantity(booklist);
                    break;
                }
                // Search a book
                case 3:
                {
                    new Book().SearchBook(booklist);
                }
               // Show all book
                case 4:
                {
                    System.out.println("            SHOWING ALL BOOKS      ");
                    System.out.println("BookID"+ " " + "BookName"+ " " +"BookAuthor"+ " " +"BookQuantity");
                    new Book().printBooklist(booklist);
                }
                //Register Student
                case 5 :
                {
                    studentList.add((new Student()).addStudent());
                        new Student().printStudentlist(studentList);
                }
            }
        }
        while (option != 0);
    }

}

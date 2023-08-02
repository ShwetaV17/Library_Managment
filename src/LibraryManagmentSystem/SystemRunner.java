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
        Student student = new Student();
        Book book = new Book();

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
                case 3: {
                    new Book().SearchBook(booklist);
                    break;
                }
                // Show all book
                case 4: {
                    System.out.println("            SHOWING ALL BOOKS      ");
                    System.out.println("BookID" + " " + "BookName" + " " + "BookAuthor" + " " + "BookQuantity");
                    new Book().printBooklist(booklist);
                    break;
                }
                //Register Student
                case 5: {
                    studentList.add((new Student()).addStudent());
                    new Student().printStudentList(studentList);
                    break;
                }
                //Check out
                case 6: {
                   System.out.println("Enter the registration number :");
                    Scanner scc = new Scanner(System.in);
                    int registerNum = scc.nextInt();
                    System.out.println("CHECK OUT");
                    for (Student students : studentList) {
                        if (registerNum == students.getRegistrationNum()) {
                            book.printBooklist(booklist);

                            System.out.println("Enter bookId of book to be checkout");
                            int bookID = scc.nextInt();

                            for(Book books : booklist) {
                                if(bookID == books.getBookId())
                                {
                                    System.out.println("Quantity of books to be wanted");
                                    int resBook = scc.nextInt();

                                int quantity = books.getBookQuantity() - resBook;
                                books.setBookQuantity(quantity);

                                System.out.println("Show all books");
                                book.printBooklist(booklist);
                            }}

                        } else {
                            System.out.println("Registration number is not present");
                        }
                    }
                } break;
                // Check in
                case 7:
                {
                    System.out.println("Enter the registration number :");
                    Scanner scc = new Scanner(System.in);
                    int registerNum = scc.nextInt();
                    System.out.println("CHECK IN");
                    for (Student students : studentList) {
                        if (registerNum == students.getRegistrationNum()) {
                            book.printBooklist(booklist);

                            System.out.println("Enter bookId of book to be checkin");
                            int bookID = scc.nextInt();

                            for(Book books : booklist) {
                                if(bookID == books.getBookId())
                                {
                                    System.out.println("Quantity of books to be wanted");
                                    int resBook = scc.nextInt();

                                    int quantity = books.getBookQuantity() + resBook;
                                    books.setBookQuantity(quantity);

                                    System.out.println("Show all books");
                                    book.printBooklist(booklist);
                                }}

                        } else {
                            System.out.println("Registration number is not present");
                        }
                    }
                } break;
            }
        }
        while (option != 0);
    }

}

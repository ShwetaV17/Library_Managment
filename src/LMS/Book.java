package LMS;

public class Book
{
   public int bookId;
    public String bookName;
    public String bookAuthor;
    public int bookPage;
    public String bookChapter;
  /* public Book(int bookId, String bookName,String bookAuthor,int bookPage, String bookChapter)
   {
       this.bookId=bookId;
       this.bookName =bookName;
       this.bookAuthor=bookAuthor;
       this.bookPage= bookPage;
       this.bookChapter= bookChapter;
   }*/

    public void setBookId(int Id)
    {
          this.bookId=Id;
    }
    public void setBookName(String name)
    {
        this.bookName = name;
    }

    public void setBookAuthor(String Author)
    {
        this.bookAuthor= Author ;
    }

    public void setBookPage(int Page)
    {
        this.bookPage = Page;
    }
    public void setBookChapter(String Chapter)
    {
        this.bookChapter = Chapter;
    }

    ////////////////////////////////////////
   public int getBookId()
   {
       return bookId;
   }
    public String getBookName()
    {
        return bookName;
    }
    public String getBookAuthor()
    {
        return bookAuthor;
    }
    public int getBookPage()
    {
        return bookPage;
    }
    public String getBookChapter()
    {
        return bookChapter;
    }


}

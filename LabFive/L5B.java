package LabFive;

import java.util.Scanner;

public class L5B {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int Isbn, NumberOfPages, Count;
      String BookTitle;
      Book[] Books = new Book[4];
      for (int i = 0; i < Books.length; i++) {
        System.out.println("[^]Enter The Values Of Book : 0" +
          (i + 1) + "");
        System.out.print("Enter The ISBN No : ");
        Isbn = Integer.parseInt(input.nextLine());
        System.out.print("Enter The Book Title : ");
        BookTitle = input.nextLine();
        System.out.print("Enter The Number Of Pages : ");
        NumberOfPages = Integer.parseInt(input.nextLine());
        System.out.print("Enter The Count : ");
        Count = Integer.parseInt(input.nextLine());
        System.out.println();
        Books[i] = new Book(Isbn, BookTitle, NumberOfPages,
          Count);
      }
      All(Books);
      System.out.println("Please Enter The ISBN No For Compare :");
      System.out.print("Book No : ");
      int c1 = input.nextInt();
      System.out.print("Book No : ");
      int c2 = input.nextInt();
      int com = Books[c1 - 1].CompareTo(Books[c2 - 1]);
      if (com == 1) {
        System.out.println(Books[c1 - 1].getBookTitle() + "Greater Than " + Books[c2 - 1].getBookTitle());
      } else if (com == 0) {
        System.out.println(Books[c1 - 1].getBookTitle() + " Equal To " + Books[c2 - 1].getBookTitle());
      } else {
        System.out.println(Books[c1 - 1].getBookTitle() + " Less Than " + Books[c2 - 1].getBookTitle());
      }
      System.out.println("\nIf Book pages More Than 500 Pages");
      System.out.println("Please Enter The ISBN No : ");
      System.out.println(IsHea(Books[input.nextInt()]));
    } catch (NumberFormatException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  public static void All(Book Books[]) {
    for (int i = 0; i < Books.length; i++) {
      System.out.print("Book " + (i + 1) + " : ");
      System.out.println(Books[i].ToString());
    }
  }

  public static boolean IsHea(Book books) {
    if (books.GetNumberOfPages() > 500) {
      return true;
    } else {
      return false;
    }
  }
}

class Book {

  private int Isbn, NumberOfPages, Count;
  private String BookTitle;

  public Book() {}

  public Book(int isbn, String bookTitle, int numberOfPages, int count) {
    this.Isbn = isbn;
    this.BookTitle = bookTitle;
    this.NumberOfPages = numberOfPages;
    this.Count = count;
  }

  public int CompareTo(Book books) {
    if (books.GetNumberOfPages() > NumberOfPages) {
      return 1;
    } else if (books.GetNumberOfPages() == NumberOfPages) {
      return 0;
    } else {
      return -1;
    }
  }

  public String ToString() {
    String TotalCon = Isbn + " " + BookTitle + " " +
      NumberOfPages;
    return TotalCon;
  }

  public void SetIsbn(int isbn) {
    Isbn = isbn;
  }

  public int GetIsbn() {
    return Isbn;
  }

  public void setBookTitle(String bookTitle) {
    BookTitle = bookTitle;
  }

  public String getBookTitle() {
    return BookTitle;
  }

  public void SetNumberOfPages(int numberOfPages) {
    NumberOfPages = numberOfPages;
  }

  public int GetNumberOfPages() {
    return NumberOfPages;
  }

  public void GetCount(int count) {
    Count = count;
  }

  public int GetCount() {
    return Count;
  }
}
package enums;

import java.util.EnumSet;

public class Main {
  public static void main(String[] args) {
    System.out.println("All books: ");

    for(Book book : Book.values())
      System.out.printf("%s%s%s%n", book, book.getTitle(), book.getCopyrightYear());
    
    System.out.printf("%nDisplay a range of enums constants: %n");

    for(Book book : EnumSet.range(Book.JHTP,Book.CPPHTP))
      System.out.printf("%s%s%s%n", book, book.getTitle(), book.getCopyrightYear());
  }
}

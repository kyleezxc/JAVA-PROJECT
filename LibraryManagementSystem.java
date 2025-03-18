import java.util.*;

public class LibraryManagementSystem{
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      SinglyLinkedList bookList = new SinglyLinkedList();
      int option, bookID;
      String bookTitle, bookAuthor;
      
      while(true){
         Menu();
         System.out.print(">> ");
         option = scan.nextInt();
         
         switch(option){
            case 1:
               System.out.print("Enter Book ID: ");
               bookID = scan.nextInt();
               scan.nextLine();
               System.out.print("Enter Book Title: ");
               bookTitle = scan.nextLine();
               System.out.print("Enter Book Author: ");
               bookAuthor = scan.nextLine();
               bookList.addBook(bookID, bookTitle, bookAuthor);
               System.out.println("Book '" + bookTitle + "' successfully added.");
            break;
            
            case 2:
               bookList.displayBook();
            break;
            
            case 3:
               System.out.print("Enter Book Title to Search: ");
               bookTitle = scan.next();
               bookList.searchBook(bookTitle);
            break;
            
            case 4:  
               System.out.println("Exiting program...");
            return;
         }
      }
   }
   
   public static void Menu(){
      System.out.println("\n--- Menu Library System ---");
      System.out.println("1. Add Book");
      System.out.println("2. Display Book");
      System.out.println("3. Search Book");
      System.out.println("4. Exit");
   }
}
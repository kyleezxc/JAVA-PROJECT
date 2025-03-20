import java.util.*;

public class LibraryManagementSystem{
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      SinglyLinkedList bookList = new SinglyLinkedList();
      DoublyLinkedList borrowList = new DoublyLinkedList();
      int option, bookID;
      String bookTitle, bookAuthor, bookBorrower;
      
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
               if(bookList.isEmpty()){
                  System.out.println("Library is empty, book not found !");
                  break;
               }
               System.out.print("Enter Book Title to Borrow: ");
               bookTitle = scan.next();
               SinglyNode borrowed = bookList.removeBook(bookTitle);
               if(borrowed == null){
                  System.out.println("Book not found!");
               }else{
                  borrowList.borrowBook(borrowed);
               }
            break;

            case 6:
               borrowList.displayBorrowedBook();
            break;

            case 8:  
               System.out.println("Exiting program...");
            return;
         }
      }
   }
   
   public static void Menu(){
      System.out.println("\n--- Menu Library System ---");
      System.out.println("1. Add Book (Singly)");
      System.out.println("2. Display Book Available (Singly)");
      System.out.println("3. Search Book (Singly)");
      System.out.println("4. Borrow Book (Doubly)");
      System.out.println("5. Return Book (Doubly)");
      System.out.println("6. Display Borrowed Book (Doubly)");
      System.out.println("7. Track Borrow History (Stack)");
      System.out.println("8. Exit");
   }
}

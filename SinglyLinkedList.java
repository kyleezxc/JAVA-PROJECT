public class SinglyLinkedList {
   SinglyNode head, tail;
   int size = 0;
   
   public boolean isEmpty() {
      if (head == null) {
         return true;
      } else {
         return false;
      }
   }

   public void addBook(int bookID, String bookTitle, String bookAuthor) {
      SinglyNode newBook = new SinglyNode(bookID, bookTitle, bookAuthor);
      if (isEmpty()) {
         head = newBook;
         size++;
      } else {
         newBook.next = head;
         head = newBook;
         size++;
      }
   }

   public void displayBook() {

      if (isEmpty()) {
         System.out.println("Library is empty.");
      } else {
         SinglyNode current = head;
         System.out.println("\n-------------------------------");
         while (current != null) {
            System.out.print(
                  "\nID: " + current.bookID + "\nTitle: " + current.bookTitle + "\nAuthor: " + current.bookAuthor
                        + "\n-------------------------------\n");
            current = current.next;
         }
      }
   }

   public boolean searchBook(String title) {
      SinglyNode current = head;

      while (current != null) {
         if (current.bookTitle.equalsIgnoreCase(title)) {
            System.out.println("--- Book Found ---");
            System.out.println("Book ID: " + current.bookID + "\nBook Title: " + current.bookTitle + "\nBook Author: "
                  + current.bookAuthor);
            System.out.println("\n----------------");
            return true;
         }
         current = current.next;
      }
      System.out.println("Book not found !");
      return false;
   }
}
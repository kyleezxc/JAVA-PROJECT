public class DoublyLinkedList {
    DoublyNode head, tail;

    public void borrowBook(SinglyNode book){
        if(book == null){
            System.out.println("Book not available for borrowing !");
            return;
        }

        if(head == null){
            DoublyNode newBook = new DoublyNode(null, book.bookID, book.bookTitle, book.bookAuthor, null);
            head = newBook;
        }else{
            DoublyNode newBook = new DoublyNode(null, book.bookID, book.bookTitle, book.bookAuthor, head);
            newBook.next = head;
            head.prev = null;
            head = newBook;
        }
        System.out.println("\nBook Borrowed: " + book.bookTitle);
    }
    
    public SinglyNode returnBook(String bookTitle){
        if(head ==  null){
            System.out.println("No books currently borrowed.");
            return null;
        }

        DoublyNode current = head;
        while(current != null && current.bookTitle.equalsIgnoreCase(bookTitle)){
            current = current.next;
        }
        
        if(current == null){
            System.out.println("Book not found in the borrower's list.");
            return null;
        }

        if(current.prev != null){
            current.prev.next = current.next;
        }
        if(current.next != null){
            current.next.prev = current.prev;
        }
        if(current == head){
            head = current.next;
        }

        return new SinglyNode(current.bookID, current.bookTitle, current.bookTitle);
    }

    public void displayBorrowedBook(){
        if(head == null){
            System.out.println("No books currently borrowed.");
            return;
        }

        DoublyNode current = head;
        System.out.println("--- Borrowed Books ----");
        while(current != null){
            System.out.println("ID: " + current.bookID + "\nTitle: " + current.bookTitle + "\nAuthor: " + current.bookAuthor + "\n-------------------------------\n");
            current = current.next;
        }
    }
}

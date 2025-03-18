public class DoublyLinkedList {
    DoublyNode head, tail;

    public void borrowBook(SinglyNode book){
        if(book == null){
            System.out.println("Book not available for borrowing !");
            return;
        }

        DoublyNode newBook = new DoublyNode(book.bookID, book.bookTitle, book.bookAuthor);
        if(head == null){
            head = newBook;
        }else{
            newBook.next = head;
            head.prev = null;
            head = newBook;
        }
        System.out.println("Book Borrowed: " + book.bookTitle);
    }
}

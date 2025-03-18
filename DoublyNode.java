public class DoublyNode {
    DoublyNode next, prev;
    String bookTitle, bookAuthor;
    int bookID;

    DoublyNode(int bookID, String bookTitle, String bookAuthor){
        this.prev = null;
        this.bookID = bookID;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.next = null;
    }
}

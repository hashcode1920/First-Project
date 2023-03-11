class Library{
    String[]  books;
    int noOfBooks = 0;
    Library(){
        this.books = new String[100];
        this.noOfBooks = 0;
    }
    public void addBooks(String book){
        this.books[noOfBooks] = book;
        noOfBooks++;
        System.out.println(book + "book has been Added...!");
    }
    void showAvailableBooks(){
        System.out.println("\nAvailable Books are: ");
        for (String book : this.books) {
            if(book == null){
                continue;
            }
            System.out.println("--> " + book);
        }
    }
    void issueBook(String book){
        for (int i=0; i<this.books.length; i++) {
            if(this.books[i].equals(book)){
                System.out.println("\nThe book has been issued.");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("\nThis book does not exist");
    }

    void returnBook(String book){
        addBooks(book);
    }
}

public class exercise2Library {
    public static void main(String[] args) {
        Library centralLibrary = new Library();
        centralLibrary.addBooks("The Power of Your Subconscious Mind ");
        centralLibrary.addBooks("Core Java ");
        centralLibrary.addBooks("Artificial Intelligence ");
        centralLibrary.addBooks("Python Programming ");
        centralLibrary.showAvailableBooks();

        centralLibrary.issueBook("Core Java ");
        centralLibrary.showAvailableBooks();

        centralLibrary.returnBook("Core Java");
        centralLibrary.showAvailableBooks();
    }
}

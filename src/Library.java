public class Library {
    Book[] books;
    int count;

    public Library() {
        books = new Book[100];
        count = 0;
    }

    public void addBook(Book bookAdd) {
        if (count < books.length) {
            books[count] = bookAdd;
            count++;
            System.out.println("We add this book in library: " + bookAdd);
        } else {
            System.out.println("We can`t add this book " + bookAdd + " library is overflowing");
        }

    }

    public void removeBook(Book bookRemove) {
        for (int i = 0; i < count; i++) {
            if (books[i].title.equals(bookRemove.title) &&
                    books[i].author.equals(bookRemove.author) &&
                    books[i].publicationYear == bookRemove.publicationYear) {
                books[i] = books[count - 1];
                books[count - 1] = null;
                count--;
                System.out.println("We remove this book " + bookRemove);
                return;
            }
        }
        System.out.println("We can't remove this book " + bookRemove);
    }

    public void printBook(Book bookList) {
        if (count > 0) {
            System.out.println("Full list book: ");
            for (int i = 0; i < count; i++) {
                System.out.println(" - " + books[i]);
            }
        } else {
            System.out.println(" Library empty ");
        }
    }


}

public class Main {
    public static void main(String[] args) {
        Book Ukaraine = new Book("Ukaraine", "Pechkin", 2020);
        Book Physic = new Book("Physic", "Makarov", 2019);
        Book Chemistry = new Book("Chemistry", "Lernov", 2018);
        Book Mathematic = new Book("Mathematic", "Pochobut", 2017);
        Book History = new Book("History", "Boyko", 2016);

        Library libraryBooks = new Library();
        libraryBooks.addBook(Ukaraine);
        libraryBooks.addBook(Physic);
        libraryBooks.addBook(Chemistry);
        libraryBooks.addBook(History);
        libraryBooks.addBook(Mathematic);

        libraryBooks.printBook(Ukaraine);

        libraryBooks.removeBook(Mathematic);
        libraryBooks.removeBook(Chemistry);
        libraryBooks.removeBook(History);

        libraryBooks.printBook(Ukaraine);
    }
}
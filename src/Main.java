public class Main {
    public static void main(String[] args) {
        programmLibrary();
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        System.out.println();
        programmStudent();
    }

    public static void programmStudent() {
        StudentManager studentManager = new StudentManager(10, 100);
        Student Alesha = new Student("Alesha", 323547, 16);
        Student Andrew = new Student("Andrew", 228901, 17);
        Student Ilya = new Student("Ilya", 124739, 16);
        studentManager.addStudent(Alesha);
        studentManager.addStudent(Andrew);
        studentManager.addStudent(Ilya);
        studentManager.addGrage(Alesha, "Math", 95);
        studentManager.addGrage(Alesha, "Physics", 85);
        studentManager.addGrage(Andrew, "Math", 90);
        studentManager.addGrage(Andrew, "Physics", 88);
        studentManager.addGrage(Ilya, "Math", 98);
        studentManager.addGrage(Ilya, "Physics", 90);
        System.out.println("Average grades:");
        System.out.println(Alesha.name + ": " + studentManager.getAverageGrade(Alesha));
        System.out.println(Andrew.name + ": " + studentManager.getAverageGrade(Andrew));
        System.out.println(Ilya.name + ": " + studentManager.getAverageGrade(Ilya));
    }


    public static void programmLibrary() {
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
package student_artur_martinenko.homework.lesson_10.level_6_middle.task_18;

import java.util.ArrayList;

class BookReaderImplDemo {
    public static void main(String[] args) {
        BookReaderImplDemo victim = new BookReaderImplDemo();
        victim.addBookToLibraryTest1();
        victim.addBookToLibraryTest2();
        victim.authorOrTitleIsEmptyTest();
        victim.caseSensitiveTest();
        victim.removeBookFromLibraryTest();
        victim.listOfBooksInLibraryTest();
        victim.findBooksByAuthorTest();


    }

    public void check(boolean expected, boolean actual, String testName) {
        if (expected == actual) {
            System.out.println("Test " + testName + " - PASSED");
        } else {
            System.out.println("Test " + testName + " - FAILED");
            System.out.println("\tExpected " + expected + " but passed " + actual);
        }
    }

    public void addBookToLibraryTest1() {
        BookReader bookReader = new BookReaderImpl();
        Book book = new Book("author", "title");
        boolean flag = bookReader.addBookToLibrary(book);
        check(true, flag, "addBookToLibraryTest1");
    }

    public void addBookToLibraryTest2() {
        BookReader bookReader = new BookReaderImpl();
        Book book = new Book("author", "title");
        bookReader.addBookToLibrary(book);
        boolean flag = bookReader.addBookToLibrary(book);
        check(false, flag, "addBookToLibraryTest2");
    }

    public void authorOrTitleIsEmptyTest() {
        BookReader bookReader = new BookReaderImpl();
        Book book = new Book("", "title");
        boolean flag = bookReader.addBookToLibrary(book);
        check(false, flag, "authorOrTitleIsEmptyTest");
    }

    public void caseSensitiveTest() {
        Book book1 = new Book("author", "title");
        Book book2 = new Book("aUthor", "tItle");
        boolean flag = book1.equals(book2);
        check(true, flag, "caseSensitiveTest");
    }

    public void removeBookFromLibraryTest() {
        BookReader bookReader = new BookReaderImpl();
        Book book = new Book("author", "title");
        bookReader.addBookToLibrary(book);
        boolean flag = bookReader.removeBookFromLibrary(book);
        check(true, flag, "removeBookFromLibraryTest");
    }

    public void listOfBooksInLibraryTest() {
        BookReader bookReader = new BookReaderImpl();
        Book book = new Book("author", "title");
        Book book1 = new Book("author1", "title1");
        bookReader.addBookToLibrary(book);
        bookReader.addBookToLibrary(book1);
        System.out.println("Test listOfBooksInLibraryTest -");
        bookReader.listOfBooksInLibrary();
    }

    public void findBooksByAuthorTest() {
        BookReader bookReader = new BookReaderImpl();
        Book book = new Book("author", "title");
        Book book1 = new Book("author", "title1");
        Book book2 = new Book("NotAnAuthor", "NotATitle");
        bookReader.addBookToLibrary(book);
        bookReader.addBookToLibrary(book1);
        bookReader.addBookToLibrary(book2);
        ArrayList<Book> temp = bookReader.findBooksByAuthor("Author");
        System.out.println("Test findBooksByAuthorTest -");
        for (Book bookAuthor : temp) {
            System.out.println(bookAuthor.toString());
        }
    }

}

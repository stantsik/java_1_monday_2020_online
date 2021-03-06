package student_aleksejs_ivanovs.homework.lesson_10.level_6;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.util.*;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Попробуйте подправить вашу реализацию. В задании говорилось, что " +
        "мы должны добавлять книгу, если она существует. Для этого, лучше подходит Интерфейс Set. " +
        "Попробуйте реализовать через коллекцию Set. Обратите внимание, что метод add у Set-a возвращает" +
        "true или false")
class BookReaderImpl implements BookReader{

    private Set<Book> bookStorage = new HashSet<>();

    @Override   //  Task_14_15
    public boolean addBook(Book book) {
        if (bookStorage.contains(book) || book.getAuthor() == null || book.getBookName() == null) {
            return false;
        } else {
            return bookStorage.add(book);
        }
    }

    @Override   //  Task_16
    public boolean removeBook(Book book) {
        return bookStorage.remove(book);
    }

    @Override   //  Task_17
    public void writeBookStorage() {
        for (Book book : bookStorage) {
            System.out.print(book.toString() + ". ");
        }
    }

    @Override   //  Task_18_19
    public void searchBooksByAuthor(String author) {
        for (Book book : bookStorage) {
            if (book.getAuthor().startsWith(author)) {
                System.out.print(book.toString() + ". ");
            }
        }
    }

    @Override   //  Task_20_21
    public void searchBooksByBooksName(String bookName) {
        for (Book book : bookStorage) {
            if (book.getBookName().startsWith(bookName)) {
                System.out.print(book.toString() + ". ");
            }
        }
    }

    @Override   //  Task_22
    public boolean markBookAsRead(Book book) {
        if (bookStorage.contains(book)) {
            book.setFinishedBook(true);
            return true;
        }
        return false;
    }

    @Override   //  Task_23
    public boolean markBookAsNotRead(Book book) {
        if (bookStorage.contains(book)) {
            book.setFinishedBook(false);
            return true;
        }
        return false;
    }

    @Override   //  Task_24
    public void writeReadBooks() {
        for (Book book : bookStorage) {
            if (book.getFinishedBook()) {
                System.out.print(book.toString() + ". ");
            }
        }
    }

    @Override   //  Task_25
    public void writeUnreadBooks() {
        for (Book book : bookStorage) {
            if (!book.getFinishedBook()) {
                System.out.print(book.toString() + ". ");
            }
        }
    }

}

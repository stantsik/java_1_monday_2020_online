package student_dmitry_vasiliev.lesson_3.homework.level_4;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class BookDemo {

        public static void main(String[] args) {
            Book myBook = new Book("Principles");
            String bookTitle = myBook.getTitle();
            System.out.println("Book title = " + bookTitle);
        }

    }


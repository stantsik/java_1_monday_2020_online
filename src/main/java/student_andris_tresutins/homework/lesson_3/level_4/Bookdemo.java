package student_andris_tresutins.homework.lesson_3.level_4;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
 class Bookdemo {
    public static void main(String[] args) {
        Book myBook = new Book("Principles");
        String bookTitle = myBook.getTitle();
        System.out.println("Book title = " + bookTitle);
    }
}

package student_lilija_g.homework.lesson_3.level_6.task_26;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class ProductDemo {

    public static void main(String[] args) {

        Product myProduct = new Product("Book", 10.88, 50);
        myProduct.printInformation();
    }
}

package student_andris_tresutins.homework.lesson_3.level_6;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
 class ProductDemo {
    public static void main(String[] args) {
        Product prod = new Product("Beans");
        prod.setPrice(2.50);
        prod.setDiscount(10);
        prod.printInformation();
    }

}

package student_lilija_g.homework.lesson_10.level_3_junior.task_10;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
interface Database { // Нет, так как интерфейс содержит два абстрактных класса (Task_7)

    void save(Product product);

    Product findByTitle(String productTitle);

}

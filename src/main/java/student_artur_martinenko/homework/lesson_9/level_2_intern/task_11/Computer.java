package student_artur_martinenko.homework.lesson_9.level_2_intern.task_11;

import teacher.annotations.CodeReview;

/*
Создайте иерархию наследования из двух уровней (родительский и дочерний).
Продемонстрируйте использование протектед конструктора в родительском классе.
Продемонстрируйте вызов протектед конструктора из класса потомка.
 */
@CodeReview(approved = true)
abstract class Computer {
    private String name;

    protected Computer(String name) {
        this.name = name;
    }
}

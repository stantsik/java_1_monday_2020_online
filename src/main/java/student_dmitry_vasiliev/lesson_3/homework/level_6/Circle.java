package student_dmitry_vasiliev.lesson_3.homework.level_6;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;
//Разработать класс - круг, у которого должны быть следующие характеристики:
//Свойства: радиус (double radius),
//Методы: расчет площади (double calculateArea()).

//Класс с объявлением фигуры круг должен называться "Circle".
//Класс с демонстрацией работы должен называться "CircleDemo".
@CodeReview(approved = true)
@CodeReviewComment(comment = "Работу приму, но название подобрано крайне не удачно. Смысл в том, чтобы я только по названию метода, мог понять, что делает этот метод" +
        "к примеру calculateArea")
class Circle {

    public double circle(double radius) {
        return (Math.PI * (radius * radius));
    }
}

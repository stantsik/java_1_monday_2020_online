package student_lilija_g.homework.lesson_8.level_4_junior.task_19;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Triangle extends Shape {
    private double side;

    public Triangle(String title, double side) {
        super(title);
        this.side = side;
    }

    @Override
    double calculateArea() {
        return side * side * Math.sqrt(3) / 4;
    }

    @Override
    double calculatePerimeter() {
        return 3 * side;
    }
}

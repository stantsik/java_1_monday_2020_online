package student_lilija_g.homework.lesson_8.level_5_middle;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Square extends Shape {

    private double side;

    public Square(String title, double side) {
        super(title);
        this.side = side;
    }

    @Override
    double calculateArea() {
        return side * side;
    }

    @Override
    double calculatePerimeter() {
        return 4 * side;
    }
}

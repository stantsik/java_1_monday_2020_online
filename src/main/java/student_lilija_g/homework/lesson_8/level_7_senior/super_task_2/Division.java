package student_lilija_g.homework.lesson_8.level_7_senior.super_task_2;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Division extends TwoArgumentMathOperation {

    public Division(MathOperation leftArgument, MathOperation rightArgument) {
        super(leftArgument, rightArgument);
    }

    @Override
    public double calculate() {
        if (0 != calculateRightSide()) {
            return calculateLeftSide() / calculateRightSide();
        }
        return 0;
    }
}

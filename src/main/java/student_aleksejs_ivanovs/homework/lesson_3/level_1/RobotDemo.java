package student_aleksejs_ivanovs.homework.lesson_3.level_1;

import teacher.annotations.CodeReviewComment;

@CodeReviewComment(comment = "bla bla bla")
class RobotDemo {

    public static void main(String[] args) {
        Robot firstRobot = new Robot("ROBO");
        firstRobot.sayHello();
        firstRobot.sayYourName();

        Robot secondRobot = new Robot("LOREN");
        secondRobot.sayHello();
        secondRobot.sayYourName();
    }
}

package student_andris_tresutins.homework.lesson_3.level_1;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
 class Demorobot {
    public static void main(String[] args) {
        Robot robotOne = new Robot( "ROBO");
        robotOne.sayHello();
        robotOne.sayYourName();

        Robot robottwo = new Robot("TerminatorV3" );
        robottwo.sayHello();
        robottwo.sayYourName();
    }
}

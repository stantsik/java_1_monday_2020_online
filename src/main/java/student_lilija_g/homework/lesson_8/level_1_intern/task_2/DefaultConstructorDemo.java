package student_lilija_g.homework.lesson_8.level_1_intern.task_2;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class DefaultConstructorDemo {
    public static void main(String[] args) {
        DefaultConstructor myDefaultConstructor = new DefaultConstructor();
        System.out.println(myDefaultConstructor.argumentOne);  //print the default values
        System.out.println(myDefaultConstructor.argumentTwo);
    }
}

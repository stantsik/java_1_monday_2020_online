package student_alexander_shl.homework.lesson_3.level_1.task_4;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Robot {
    String name;

    public Robot(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello!");
    }
}

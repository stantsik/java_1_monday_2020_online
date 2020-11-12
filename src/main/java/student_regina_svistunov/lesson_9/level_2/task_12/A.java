package student_regina_svistunov.lesson_9.level_2.task_12;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class A {
    public A() {
        System.out.println("Class A Constructor");
    }
}

class B extends A {
    public B() {
        System.out.println("Class B Constructor");
    }
}

class C extends B {
    public C() {
        System.out.println("Class C Constructor");
    }
}


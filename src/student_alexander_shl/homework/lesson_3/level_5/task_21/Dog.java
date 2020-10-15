package student_alexander_shl.homework.lesson_3.level_5.task_21;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Dog {
    public String dogName;
    public int dogAge;
    public String dogColor;

    public Dog(String dogName, int dogAge, String dogColor) {
        this.dogName = dogName;
        this.dogAge = dogAge;
        this.dogColor = dogColor;
    }

    void voice() {
        System.out.println("Dog name is: " + dogName + ", Age is: " + dogAge + ", Color is: " + dogColor);
    }

}

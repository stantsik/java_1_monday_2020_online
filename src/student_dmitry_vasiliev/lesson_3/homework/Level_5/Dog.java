package student_dmitry_vasiliev.lesson_3.homework.Level_5;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Dog {
    private String name;
    private String color;
    private int age;

    public static void bark() {
        System.out.println("Wof...");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setColor(String color) {
        this.color = color;
    }


}

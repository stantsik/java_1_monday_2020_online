package student_andris_tresutins.homework.lesson_3.level_4;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
 class Car {
    private String model;

    public Car(String newModel) {
        this.model = newModel;
    }

    public String getModel() {
        return this.model;
    }
}

package student_lilija_g.homework.lesson_4.level_x.super_task_4;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Этому классу не нужно состояние. Можно смело убрать ему waveLength. Все, что тут должно бюыть, это один метод detect. " +
        "Однако, вы его почему-то не вызываете даже")
class LightColorDetector {

    final private int wavelength;
    public LightColorDetector(int wavelength){
        this.wavelength = wavelength;
    }

    String detect(int wavelength) {

        if (wavelength >= 380 && wavelength <= 449) {
            return "Violet";
        } else if (wavelength >= 450 && wavelength <= 494) {
            return "Blue";
        } else if (wavelength >= 495 && wavelength <= 569) {
            return "Green";
        } else if (wavelength >= 570 && wavelength <= 589) {
            return "Yellow";
        } else if (wavelength >= 590 && wavelength <= 619) {
            return "Orange";
        } else if (wavelength >= 620 && wavelength <= 750) {
            return "Red";
        } else {
            return "Invisible Light";
        }
    }
}

package student_andris_tresutins.homework.lesson_8.level_1;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task_2 {

    String printText;

    public void setText(String printText){
        this.printText = printText;
    }

    public String getText(){
        return printText;
    }
}

package student_andris_tresutins.homework.lesson_8.level_1;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Task_1 {
    String printText;

    Task_1(){ }

    public void setText(String printText){
        this.printText = printText;
    }

    public String getText(){
        return printText;
    }
}

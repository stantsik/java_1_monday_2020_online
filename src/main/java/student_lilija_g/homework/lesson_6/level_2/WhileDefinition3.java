package student_lilija_g.homework.lesson_6.level_2;

import teacher.annotations.CodeReview;

/*
Найдите ошибку в программе и исправить её:

class WhileDefinition3 {

    public static void main(String[] args) {
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            i++;
                        // -> }
    }

}
 */
@CodeReview(approved = true)
public class WhileDefinition3 {

    public static void main(String[] args) {
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }
    }
}

package student_lilija_g.homework.lesson_6.level_2;
/*
Найдите ошибку в программе и исправить её:

class WhileDefinition1 {

    public static void main(String[] args) {
        int i = 1;
        while i <= 100) {        // -> while (i <= 100) {
            System.out.println(i);
            i++;
        }
    }

}

 */

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class WhileDefinition1 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }
    }
}

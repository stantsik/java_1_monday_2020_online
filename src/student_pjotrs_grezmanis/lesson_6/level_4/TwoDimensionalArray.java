package student_pjotrs_grezmanis.lesson_6.level_4;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Давайте перечитаем задание. Там просят создать МЕТОД, который заполняет случайными числами двумерный массив и МЕТОД, который" +
        "для вычисления суммы. У вас на лицо пример, когда весь функционал слит в один большой метод и сходу очень трудно понять, что тут вообще происходит.")
public class TwoDimensionalArray {

    public static void fillArrayRandomNumbers(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) Math.round(Math.random() * 10);
            }
        }
    }

    public static int sumTwoArray(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }
}
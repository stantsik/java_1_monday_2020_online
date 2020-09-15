package student_aleksejs_ivanovs.homework.lesson_5.level_2;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.util.Random;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Сделайте так, чтобы программа не зависила от размерности массива. Чтобы если я подставил там int[10], весь код бы работал правильным образом без изменений.")
class TaskFourteen {

    public static void main(String[] args) {
        Random random = new Random();
        int arrayLength = 3;
        int[] numbers = new int[arrayLength];
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
            sum += numbers[i];
            System.out.print(numbers[i] + " ");
        }
        sum = sum / arrayLength;
        System.out.println("\nAverage of array cells = " + sum);
    }
}

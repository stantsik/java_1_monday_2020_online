package student_pjotrs_grezmanis.lesson_4.level_2;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = true)
class Task_7 {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Enter wholeNumber One");
        int numberOne = inputNumber.nextInt();
        System.out.println("Enter wholeNumber Two");
        int numberTwo = inputNumber.nextInt();

        if (numberOne == numberTwo) {
            System.out.println("Numbers are equals");
        } else {
            System.out.println("Numbers are different");
        }


    }
}



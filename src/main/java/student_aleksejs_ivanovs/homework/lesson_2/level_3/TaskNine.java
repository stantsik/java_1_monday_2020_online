package student_aleksejs_ivanovs.homework.lesson_2.level_3;

import java.util.Scanner;

public class TaskNine {

    public static void main(String[] args) {
        System.out.println ("Enter integer!");
        Scanner num = new Scanner(System.in);
        int number = num.nextInt();

        //TODO: Не хватает пробелов for (int i=1; i<=10; i++){ => for (int i = 1; i <= 10; i++) {
        //Вам не стоит это исправлять сейчас в задании ) Просто обратите внимание.
        for (int i=1; i<=10; i++){
            int answer = number * i;
            System.out.println(number +" * "+ i +" = "+ answer);
        }
    }
}

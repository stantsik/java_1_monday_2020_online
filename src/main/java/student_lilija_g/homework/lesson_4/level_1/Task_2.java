package student_lilija_g.homework.lesson_4.level_1;

import java.util.Scanner;

class Task_2 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter your integer: ");
        int yourNumber = myScanner.nextInt();

        if (yourNumber < 0)

            System.out.println("Your number " + yourNumber+ " is negative.");

        else if (yourNumber == 0)

            System.out.println("Your number is 0.");
        else
            System.out.println("Your number " + yourNumber+ " is positive.");

    }
}

package student_andris_tresutins.homework.lesson_5.level_6;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Please move the code here so I could see it in this particular " +
        "class. It is really hard to navigate to the class where tests are supposed to be" +
        "by your implementation. Call it like ArrayUtilsTest_Task38 or any " +
        "" +
        "Still false. find number where? in static array? why? I want to use this method for any array...")
public class Task_38 {

    public int findMinNumber() {

        Task_36 victim = new Task_36();
        int[] myIntArray = victim.staticArray();

        int min = myIntArray[1];
        for (int i = 0; i < myIntArray.length; i++) {
            if (myIntArray[i] < min) {
                min = myIntArray[i];
            }

        }
        return min;

    }
}

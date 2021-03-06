package student_dmitry_vasiliev.lesson_6.level_4;

//import java.lang.reflect.Array;
import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.util.Random;

@CodeReview(approved = true)
class ArrayUtil {

    public int[] createArray(int arrayLength) {
        int[] newArray = new int[arrayLength];
        return  newArray;
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
        }
    }

    public void printArrayToConsole(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public void printArrayToConsoleString(int[] array) {
        String str = "{";
        for (int i = 0; i < array.length; i++) {
            str = str + array[i];
            if (i < array.length - 1) {
                str = str + ",";
            }
        }
        System.out.println("Array is: " + str + "}");

    }

    public int findMaxNumberReturn(int[] array) {
        int maxNumber = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNumber) {
                maxNumber = array[i];
            }
        }
        return maxNumber;
    }

    public int findMinNumberReturn(int[] array) {
        int minNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minNumber) {
                minNumber = array[i];
            }
        }
        return minNumber;
    }

    public int findSelectedNumberReturn(int[] array, int selectedNumber) {
        int number = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == selectedNumber) {
                number = array[i];
            }
        }
        return number;

    }

    public int counterSelectedNumber(int[] array, int selectedNumber) {
        int number = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == selectedNumber) {
                number++;
            }
        }
        return number;

    }

    public int changeFirstSelectedNumber(int[] array, int selectedNumber, int newNumber) {
        int number = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == selectedNumber) {
                array[i] = newNumber;
                number = i;
                i = array.length;
            }
        }
        return number;
    }

    public int changeAllSelectedNumber(int[] array, int selectedNumber, int newNumber) {
        int number = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == selectedNumber) {
                array[i] = newNumber;
                number++;
            }
            System.out.print( array[i] + " ");
        }
        return number;
    }

    public int[] arrayRotate(int[] array) {
        int number = 0;
        int k = array.length - 1;
        int[] newArray = new int[array.length];
        System.out.print("Old array - ");
        for (int i = 0; i < array.length; i++) {
            newArray[k] = array[i];
            k--;
            number++;
            System.out.print( array[i] + " ");
        }
        System.out.print("; New array - ");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print( newArray[i] + " ");
        }
        return newArray;
    }

    public int twoAarraysCompare(int[] testArray, int[] newArray) {
        ArrayUtilTest arrayUtil = new ArrayUtilTest();
        int checkNumber = 0;
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] == testArray[i]) {
                checkNumber++;
            }
        }
        return checkNumber;
    }
        public int arraySortMinMax(int[] array) {
            int maxNumber = 0;
            int value = 0;
            int nextNum = array.length - 1;
            int[] newArray = new int[array.length];

            System.out.print("Old array - ");
            for (int i = 0; i < array.length; i++) {
                System.out.print( array[i] + " ");
            }

            for (int i = 0; i < array.length; i++) {
                for (int k = 0; k < array.length; k++) {
                    if (array[k] > maxNumber) {
                        maxNumber = array[k];
                        value = k;
                    }
                }
                newArray[nextNum] = maxNumber;
                nextNum--;
                maxNumber = 0;
                array[value] = 0;
            }
            System.out.print("; New array - ");
            for (int i = 0; i < newArray.length; i++) {
                System.out.print( newArray[i] + " ");
            }
            return newArray[0];
        }
}


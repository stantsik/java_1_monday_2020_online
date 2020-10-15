package student_alexander_shl.homework.lesson_3.level_6.task_28;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class ComputerDemo {


    public static void main(String[] args) {
        Computer dell = new Computer("Dell", "XXX-1");
        String manufacturer = dell.getManufacturer();
        String model = dell.getModel();
        System.out.println("Computer manufacturer = " + manufacturer);
        System.out.println("Computer model = " + model);
    }
}

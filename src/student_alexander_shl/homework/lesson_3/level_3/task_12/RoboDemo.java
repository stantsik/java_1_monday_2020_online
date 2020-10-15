package student_alexander_shl.homework.lesson_3.level_3.task_12;
/*
Дайте роботу имя! Продолжение.

Тема: объявление конструктора класса.


Добавьте в класс Robot конструктор с параметром String name:

    class Robot {

        // в этом свойстве наш виртуальный обьект робот будет
        // запоминать своё имя. Мы используем тип String потому
        // что имя это строка.
        private String name;

        // Это конструктор класса. У этого конструктора один параметр
        // с названием name и типом String. Тоесть при создании робота
        // в его конструктор будут передавать название робота.
        public Robot(String robotName) {
            this.name = robotName; // а тут робот запоминает в своем свойстве this.name как его зовут
        }

    }

В классе RobotDemo передайте в конструктор каждого робота его название:

Robot robot1 = new Robot("Rider"); // пусть этого робота зовут "Rider"
robot1.sayHello();
robot1.sayYourName();

Robot robot2 = new Robot("John"); // а этого робота зовут "John"
robot2.sayHello();
robot2.sayYourName();

 */


import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class RoboDemo {
    public static void main(String[] args) {
        Robo myRobot = new Robo("Rider");
        myRobot.sayHello();
        myRobot.sayYourName();

        Robo robot1 = new Robo("John");
        robot1.sayHello();
        robot1.sayYourName();

        Robo robot2 = new Robo("Elisa");
        robot2.sayHello();
        robot2.sayYourName();

    }
}

package student_aleksejs_ivanovs.homework.lesson_9.level_4_5_6;

import teacher.annotations.CodeReview;

/* Task_24
Изучаем Single Responsibility Principle.

Вынесем код первого правила автоматического определения мошенничества в отдельный класс.

Создайте класс FraudRule1:

class FraudRule1 extends FraudRule {

    public FraudRule1(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        // Перенесите сюда код реализации первого правила из класса FraudDetector
    }

}

Напишите югит тесты для класса FraudRule1!*/
@CodeReview(approved = true)
class FraudRule1 extends FraudRule{

    public FraudRule1(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        return t.getTrader().getFullName().equals("Pokemon");
    }

}

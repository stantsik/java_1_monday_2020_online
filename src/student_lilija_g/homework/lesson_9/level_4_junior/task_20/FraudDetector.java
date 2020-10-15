package student_lilija_g.homework.lesson_9.level_4_junior.task_20;

class FraudDetector {

    boolean isFraud(Transaction transaction, int amount) {
        return isFraudRuleOne(transaction)||isFraudRuleTwo(transaction,amount)||isFraudRuleThree(transaction)||isFraudRuleFour(transaction);
    }

    boolean isFraudRuleOne(Transaction transaction) {
        Trader trader = transaction.getTrader();
        return "Pokemon".equals(trader.getFullName());
    }
    boolean isFraudRuleTwo(Transaction transaction, int amount) {
        return amount>1000000;
    }

    Boolean isFraudRuleThree(Transaction transaction){
        Trader trader = transaction.getTrader();
        return "Sydney".equals(trader.getCity());
    }
    Boolean isFraudRuleFour(Transaction transaction){
        Trader trader = transaction.getTrader();
        return "Jamaica".equals(trader.getCountry());
    }
}




package student_artur_martinenko.homework.lesson_9.level_4_junior.task_18;

import teacher.annotations.CodeReview;

import java.util.Objects;

@CodeReview(approved = true)
class Trader {

    private String fullName;
    private String city;

    public Trader(String fullName, String city) {
        this.fullName = fullName;
        this.city = city;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCity() {
        return city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trader trader = (Trader) o;
        return Objects.equals(fullName, trader.fullName);
    }

}

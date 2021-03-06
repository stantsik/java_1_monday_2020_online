package student_aleksejs_ivanovs.homework.lesson_10.level_1.task_3;

import teacher.annotations.CodeReview;

/*Создаём интерфейс для структуры данных список.

Массив в Java это хорошая структура данных для хранения примитивных типов данных
или ссылок на объекты. Но у массива есть много ограничений. Например длинну массива
нельзя изменить после его создания.

В этом задании предлагается создать интерфейс для структуры данных список.
Структура данных список - это тот же массив, только без ограничений!
Придумайте каких операций вам не хватает в массиве. Для каждой операции
создайте свой метод в интерфейсе MyList и опишите словами, что этот метод должен
делать в коментарии к методу.

Не подсматривайте имплементацию java.util.List и тому подобных интерфейсов и классов.

Цель этого задания самостоятельно разработать свой интерфейс MyList.*/
@CodeReview(approved = true)
interface MyList {

    void addToList(Object o);

    void removeFromList(Object o);

    void removeFromListByIndex(int index);

    int printValueByIndex(int index);

    boolean checkIfObjectExistInList(Object o);


}

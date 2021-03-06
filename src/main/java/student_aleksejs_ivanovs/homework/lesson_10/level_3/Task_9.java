package student_aleksejs_ivanovs.homework.lesson_10.level_3;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task_9 {

/*
Для чего применяются объекты этого класса?
: Главная цель Optional — замена null-значений, благодаря чему должна повышаться безопасность и читаемость кода.

Какие два состояния могут быть у объектов этого класса?
: Может содержать или не содержать ненулевое значение.

Как создаются экземпляры данного класса?
: Optional<Person> optionalNullable = Optional.ofNullable(somePerson);   Optional объект с возможностью нулевого значения.

Как можно проверить в каком состоянии находится экземпляр данного класса?
: optionalNullable.isPresent();   возвращает true тогда и только тогда, когда значение не равно нулю.

Как можно получить объект, который находится внутри Optional?
: optionalNullable.get();   может возвращать значение только в том случае, если обернутый объект не равен null, в противном случае он выдает исключение NoSuchElementException.
*/

}

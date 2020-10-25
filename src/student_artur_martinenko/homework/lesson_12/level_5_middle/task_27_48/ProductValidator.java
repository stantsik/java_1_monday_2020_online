package student_artur_martinenko.homework.lesson_12.level_5_middle.task_27_48;

import java.util.List;

interface ProductValidator {

    List<ValidationException> validate(Product product);

}

//Task_32
/*
Следующая задача заключается в определении внешнего интерфейса
нашей подсистемы валидации. Вы спросите почему мы хотим определить
внешний интерфейс для нашей подсистемы, когда не реализована сама
подсистема валидации? Это логичный вопрос.

Ответ на него прост. Наша система это только чать большой системы
интернет магазина. Наш прототип процесса валидации никому не нужен
сам по себе. Он нужен и имеет смысл только в рамках системы
интернет магизина и должен быть хорошо синтегрён с остальными
частями системы.

Для хорошей интеграции различных подсистем между собой важно чётко
определить обязанности и границы ответственности каждой подсистемы
и определить точки интеграции подсисстем между собой.

Внешний интерфейс подсистемы это как раз и есть место интеграции,
подсистема UI сможет пользоваться этим внешним интерфейсом для
вызова функциональности нашего прототипа процесса валидации.

Задача: разработайте внешний интерфейс для процесса валидации
данных о продукте. Этот интерфейс должен быть простым и понятным.

 */

//Task_33
/*
Внешний интерфейс нашего прототипа процесса валидации может выглядеть так:

interface ProductValidator {

    List<ValidationException> validate(Product product);

}

На вход мы получаем введённые сотрудником магазина данные о продукте
в виде объекта класса Product, а на выход выдаём список ошибок.

Если список ошибок пуст - это значит процесс валидации прошёл успешно
и введённые данные удовлетворяют всем автоматическим правилам валидации.

Если в списке есть ошибки, то процесс валидации выявил ошибки в
предоставленных данных о продукте. В таком случае в возвращаемом
списке будет не одна, а все обнаруженные ошибки валидации. Это
означает, что UI сможет проанализировать список ошибок и отметить
на форме все данные в которых сотрудник компании допустил ошибку.
 */

# JPA relationships mapping

## План

* Embedded классы
* Ассоциации ManyToOne/OneToMany
* Двунаправленные ассоциации OneToMany
* Ассоциации OneToOne
* Ассоциации ManyToMany
* Отображение коллекций простых элементов

###### Дополнительно
* Отображение наследования

## Useful Links

[javaworld.com](http://www.javaworld.com/article/2077819/java-se/understanding-jpa-part-2-relationships-the-jpa-way.html)

## Домашнее задание


Вы деканат итиса. Нужно реализовать 2 таблицы:

**1. Студенты** 

id            | Фамилия     | Имя  | Отчество     |Группа       
------------- |-------------| -----|--------------|--------------
 
 все поля обязательны

**2. Баллы**
 
id    | Предмет |	Баллы за предмет	| id студента 
------|---------|------------------|-------------

 предмет - Enum
 
 id студента - foreign key

 *Пример:*

![alt text](https://cs7064.vk.me/c623423/v623423189/4a57f/Buwck_8BknA.jpg "fuck")


Реализовать 3 метода: 
 - Свой суммарный балл за все предметы
 - Средний балл по всем предметам
 - Балл по определенному предмету

Данные в БД вбивать вручную или отдельным методом 
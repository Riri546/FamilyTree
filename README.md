# Семейное древо 

## Задание 1. 
Реализовать, с учетом ооп подхода, приложение
Для проведения исследований с генеалогическим древом.
Идея: описать некоторое количество компонент, например:
модель человека и модель семейного дерева для хранения связей и отношений между людьми: родитель, ребёнок - классика, но можно подумать и про отношение, брат, свекровь, сестра и т. д.
У дерева обязательно реализовать метод добавления нового человека в семейное дерево, поиск человека по имени и вывод всех людей из дерева.
У человека можно реализовать методы вывода всех сестер или всех детей.

## Задание 2.
В проекте с гениалогическим древом подумайте и используйте интерфейсы.
Дополнить проект методами записи в файл и чтения из файла. Для этого создать отдельный класс и реализовать в нем нужные методы. Для данного класса сделайте интерфейс, который и используйте в своей программе. Например в классе дерева в качестве аргумента метода save передавайте не конкретный класс, а объект интерфейса, с помощью которого и будет происходить запись. Пример работы с интерфейсом Serialazable можно найти в материалах к уроку.

## Задание 3.
В проекте с деревом реализовать интерфейс Iterable для дерева.
Создать методы сортировки списка людей перед выводом, например по имени или по дате рождения.

## Задание 4.
Продолжаем грейдить наш проект с гениологическим древом. Изменить древо, сделать класс параметизированным. Продумать класс общения с пользователем, сделать набор команд, для операций над деревом.

## Задание 5.
Продолжаем работать с проектом дерева. Попытаться структурировать список команд. Если не создан отдельный класс под общение с пользователем, то создать. Все процессы связанные с выводом на консоль или чтением с консоли необходимо делать только в одном специализированном классе (например View). Сам этот класс может общаться со многими классами позволяющих ему реализовать эти две задачи. 

## Задание 6.
Рефакторинг и\или оптимизация проекта предыдущего дз с учетом теоретических основ SOLID’а.

## Задание 7.
Необходимо реализовать свой проект на любом языке программирования.




# FamilyTree

## Task 1.
Implement, taking into account the OOP approach, the application
For conducting research with a family tree.
Idea: describe a number of components, for example:
a human model and a family tree model for storing connections and relationships between people: parent, child - a classic, but you can also think about the relationship, brother, mother-in-law, sister, etc.
The tree must implement a method for adding a new person to the family tree, searching for a person by name and removing all people from the tree.
A person can implement methods for the output of all sisters or all children.

## Task 2.
In a project with a genialogical tree, think and use interfaces.
To supplement the project with methods of writing to a file and reading from a file. To do this, create a separate class and implement the necessary methods in it. For this class, make an interface, which you use in your program. For example, in a tree class, pass not a specific class as an argument of the save method, but an interface object with which the recording will take place. An example of working with the Serialazable interface can be found in the materials for the lesson.

## Task 3.
In a project with a tree, implement the Iterable interface for a tree.
Create methods for sorting the list of people before output, for example by name or by date of birth.

## Task 4.
We continue grading our project with a family tree. Change the tree, make the class parameterized. Think over the class of communication with the user, make a set of commands for operations on the tree.

## Task 5.
We continue to work with the tree project. Try to structure the list of commands. If a separate class has not been created for communication with the user, then create. All processes related to output to the console or reading from the console must be done only in one specialized class (for example, View). This class itself can communicate with many classes allowing it to implement these two tasks. 

## Task 6.
Refactoring and/or optimization of the previous dz project, taking into account the theoretical foundations of SOLID

## Task 7.
It is necessary to implement your project in any programming language.
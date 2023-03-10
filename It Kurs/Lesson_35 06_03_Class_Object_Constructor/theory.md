# **Class and his Objects (Класс и его Объекты)**

## Объект (Object) - 
это нужная/полезная для смысла жизни "сущность", например:
предмет, человек или животное, организация, деталь и т.д. 

## Класс (Class) -
это совокупность однородных объектов. 

## Класс в коде Java —
это шаблонная конструкция, которая позволяет описать принадлежащий классу объект,
его свойства (атрибуты/поля класса) и поведение (методы класса).

### Объекты -
это экземпляры класса, сожданные по шаблону
Примеры: 
class Car { // класс Автомобили 

String brand;
// марка - Audi, BMW, Mercedes, Opel, ... 
- поле для марки Автомобидя 

- String type; 
- // тип - седан, универсал, внедорожник, ...
- поле для типа Автомобиля 

- int capacity; 
- // вместимость - 2, 4, 5, 7 человек - - характеристика Автомобиля
}

## Синтаксис:
class ClassName { 
Type classField1; // Тип полеКлвсса1 (важная характеристика) 
Type classField12; // Тип полеКлвсса2 (важная характеристика) ... 
} 

#### Поле класса —
это переменная и ее тип, которая описывает какое-либо из важных свойств данного класса. 
Обычно количество реально важных характеристик класса 2 - 3 - 4 - 5 , иначе 
с классом становится трудно работать.

Каждый Класс - это шаблон для описания Объекта с помощью задания сущестенных характеристик (полей).

## Constructor (конструктор Класса) -
определяет поля Класса и их начальные значения.

## Setter -
позволяет задать значения полей Объекта в Классе.

## Getter -
позволяет получать значения полей Объекта в Классе.

## Понятие ИНКАПСУЛЯЦИИ (encapsulation) и СОКРЫТИЯ ()
Сокрытие реализации — это механизм для ограничения доступа к некоторым компонентам объекта. Сокрытие данных означает сокрытие от пользователя несущественных деталей и отображение ему только соответствующих, нужных данных. Сокрытие данных достигается посредством модификаторов доступа (private, public, protected, default-package), каждый из которых определяет свой уровень доступности.

## Инкапсуляция —
это объединение данных и методов работы с этими данными в одной упаковке («капсуле»). В Java в роли упаковки-капсулы выступает Класс. Класс содержит в себе и данные (поля класса), и методы для работы с этими данными.
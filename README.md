# MyApplication
# Лабораторная работа №1: Создание Activity и передача параметров между ними

- _Выполнил:_ Герасименко Ксения
- _Язык программирования:_ Java

## Описание приложения
Приложение состоит из двух экранов и передает вводимые параметры с одного Activity на другой при нажатии на кнопку "Press me to new window". Для запуска проекта следуйте разделу ["Как собрать проект?"](##Как-собрать-проект).

### Внешний вид
После запуска открывается экран 1 (`MainActivity1`) с кнопкой "Press me to new window" и двумя текстовыми полями для ввода фамилии и имени (либо же других ТЕКСТОВЫХ значений). По нажатию на кнопку происходит:
- Переход на экран 2 (`MainActivity2`)
- Запись параметров в систему из двух текстовых полей, в которые были введены значения пользователя.
- Передача этих параметров на второй экран (`MainActivity2`). 
- Паремтры выводятся на соответсвующие поля отдельно (`Имя`) и (`Фамилия`).

<p align="center">
    <img src="https://github.com/user-attachments/assets/32fd4a64-4334-4547-b8bc-90913f139833" width="250"> 
    <img src="https://github.com/user-attachments/assets/e098379c-fb5d-47d3-a607-75c2b63e3a9c" width="250">
</p> 

## <a id="Как-собрать-проект">Как собрать проект?</a>
_Описан один из возможных способов:_
1. Скачать ZIP проекта:
    - Клик на зеленую кнопку "<> Code".
    - Клик на "Download ZIP".
2. Распаковать загруженный архив.
3. Запустить Android Studio.
4. Клик на "Open..." на начальном экране / в верхней панели File -> Open...
5. Выбрать распакованный архив "Lab12-master".
5. Выбрать распакованный архив.
6. Дождаться завершения всех процессов внутри проекта.
7. Выбрать эмулятор или подключить реальное устройство.
8. Клик на "Run" (должна быть выбрана конфигурация "app").
9. Готово ✅

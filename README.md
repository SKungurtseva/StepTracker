# StepTracker
First sprint homework

## ТЗ "Счетчик калорий".
---
### Постановка задачи.
---
Компания по производству спортивных носков решила разработать свой счётчик калорий для дополнительной мотивации ведения здорового образа жизни.

Прототип приложения предоставляет следующий функционал:
1. Консольный интерфейс для управления программой;
2. Хранение данных о количестве пройденных шагов за несколько месяцев;
3. Ввод вашей цели по количеству шагов в день;
4. Ввод пройденного количества шагов за день;
5. Вывод статистики за определённый месяц.


### Класс Main
---
В этом классе реализован основной цикл приложения — считывание команд и вызов соответствующих методов основного класса приложения — StepTracker. Вся работа с пользовательским вводом должна производиться в классе Main.

Пользователь взаимодействует с приложением через консольный интерфейс, который позволяет произвести одно из действий по выбору:

1. Ввести количество шагов за определённый день;
2. Напечатать статистику за определённый месяц;
3. Изменить цель по количеству шагов в день;
4. Выйти из приложения.

После выбора и исполнения действия, программа позволяет пользователю ввести следующее действие. Программа завершается только при вводе пользователем команды выхода. При вводе несуществующей команды выводится сообщение о том, что такой команды нет, после чего приложение позволяет снова выбрать следующее действие. 


### Класс StepTracker
---
В классе хранится информация о пройденных шагах, реализована логика по сохранению и изменению количества шагов, а так же рассчитывается статистика.

#### В памяти приложения хранится следующая информация:

* Данные о шагах, пройденных в каждый день месяца. В году 12 месяцев и для удобства считаем, что в каждом ровно 30 дней.
* Целевое количество шагов. При старте приложения устанавливается равным 10 000 в день.

#### В классе реализована следующая функциональность:

1. Сохранение количества шагов за день. Пользователь должен указать номер месяца (начиная с 0), номер дня и количество шагов, пройденных в этот день. Количество шагов должно быть неотрицательным. Для ускорения прототипирования на данном этапе считается, что в месяце ровно 30 дней. Если за какой-то день статистика не сохранялась, то считаем количество шагов в этот день равным 0.
2. Подсчёт и вывод статистики за указанный пользователем месяц. В статистике должны быть следующие данные:
   
   * Количество пройденных шагов по дням в следующем формате:
1 день: 3000, 2 день: 2000, ..., 30 день: 10000

   * Общее количество шагов за месяц;
  
   * Максимальное пройденное количество шагов в месяце;
  
   * Среднее количество шагов;
  
   * Пройденная дистанция (в км);
  
   * Количество сожжённых килокалорий;
  
   * Лучшая серия: максимальное количество подряд идущих дней, в течение которых количество шагов за день было равно или выше целевого.
  
3. Изменение целевого количества шагов. Данные вводятся пользователем. Введённое значение не должно быть отрицательным.


### Класс Converter
---
В этом классе осуществляется преобразование шагов в километры и калории.

* Для подсчёта дистанции можно считать, что один шаг равен 75 см.

* Для подсчёта количества сожжённых килокалорий можно считать, что 1 шаг = 50 калорий, 1 килокалория = 1 000 калорий.
  











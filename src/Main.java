import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker();

        while (true) {
            printMenu();
            int userInput = scanner.nextInt();
            if (userInput == 1) {
                System.out.println("Введите месяц от 1 до 12.");
                int month = scanner.nextInt();
                while (month < 1 || month > 12) {
                    System.out.println("Введите пожалуйста месяц от 1 до 12.");
                    month = scanner.nextInt();
                }
                System.out.println("Введите день от 1 до 30.");
                int day = scanner.nextInt();
                while (day < 1 || day > 30) {
                    System.out.println("В месяце 30 дней.");
                    day = scanner.nextInt();
                }
                System.out.println("Введите количество шагов.");
                int steps = scanner.nextInt();
                while (steps < 0) {
                    System.out.println("Количество шагов не должно быть отрицательным.");
                    steps = scanner.nextInt();
                }
                System.out.println("Ваши шаги добавлены.");
                stepTracker.addSteps(month, day, steps);

            } else if (userInput == 2) {
                Converter converter = new Converter();
                System.out.println("Введите месяц от 1 до 12.");
                int month = scanner.nextInt();
                while (month < 1 || month > 12) {
                    System.out.println("Введите пожалуйста месяц от 1 до 12.");
                    month = scanner.nextInt();
                }
                stepTracker.stepsPerDay(month);
                int sumStepMonth = stepTracker.sumStepMonth(month);
                System.out.println("Общее количество шагов за месяц " + stepTracker.sumStepMonth(month) +
                        "\nМаксимально пройденное количество шагов в месяц " + stepTracker.getMaxStep(month) +
                        "\nСреднее количество шагов " + stepTracker.findAverageStep(month) +
                        "\nПройденная дистанция в (км) " + converter.distancePerMonth(sumStepMonth) +
                        "\nКоличество сожженных килокалорий " + converter.cCal(sumStepMonth) +
                        "\nЛучшая серия - " + stepTracker.bestSeriesDay(month) + " дней.");

            } else if (userInput == 3) {
                System.out.println("Введите новую цель количества шагов.");
                int changeTarget = scanner.nextInt();
                while (changeTarget < 0) {
                    System.out.println("Введенное значение не должно быть отрицательным.");
                    changeTarget = scanner.nextInt();
                }
                System.out.println("Цель изменена.");
                stepTracker.changeTarget(changeTarget);
                System.out.println("Новая цель " + changeTarget + " шагов за день.");

            } else if (userInput == 0) {
                System.out.println("Программа завершена.");
                break;
            } else {
                System.out.println("Извините, такой команды пока нет!");
            }
        }
    }

    public static void printMenu() {
        System.out.println("Что вы хотите сделать?\n" +
                "1 - Ввести количество шагов за определенный день\n" +
                "2 - Напечатать статистику за определенный месяц\n" +
                "3 - Изменить цель по количеству шагов в день\n" +
                "0 - Выход");
    }
}

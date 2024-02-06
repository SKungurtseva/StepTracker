public class StepTracker {
   private int target = 10000;

    MonthData[] monthToData;
    public StepTracker() {
        monthToData = new MonthData[12];
        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }

    class MonthData {
        int[] dayOfMonth = new int[30];
    }
    // Добавить шаги за день.
    public void addSteps(int month, int day, int stepsPerDay) {
        MonthData monthData = monthToData[month -1];
        monthData.dayOfMonth[day - 1] = stepsPerDay;
        //int steps = monthData.dayOfMonth[day - 1];
    }
    // Количество пройденных шагов по дням в формате 1 день : 300, ..., 30 день : 10000
    public void stepsPerDay(int month) {
        MonthData monthData = monthToData[month - 1];
        for (int i = 0; i < monthToData[month - 1].dayOfMonth.length; i++) {
            System.out.print((i + 1) + " день: " + monthData.dayOfMonth[i]);
            if (i < monthToData[month - 1].dayOfMonth.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    // Общее количество шагов за месяц.
    public int sumStepMonth(int month) {
        int sumStepMonth = 0;
        for (int i = 0; i < monthToData[month - 1].dayOfMonth.length; i++) {
            sumStepMonth += monthToData[month - 1].dayOfMonth[i];
        }
        return sumStepMonth;
    }
    // Максимальное пройденное количество шагов в месяц.
    public int getMaxStep(int month) {
        int getMaxStep = 0;
        for (int i = 0; i < monthToData[month - 1].dayOfMonth.length; i++) {
            if (monthToData[month - 1].dayOfMonth[i] > getMaxStep) {
                getMaxStep = monthToData[month - 1].dayOfMonth[i];
            }
        }
        return getMaxStep;
    }
    // Среднее количество шагов.
    public int findAverageStep(int month) {
        int findAverageStep = 0;
        int sumStepMonth = sumStepMonth (month);
            findAverageStep = sumStepMonth / monthToData[month - 1].dayOfMonth.length;
        return findAverageStep;
    }
    // Лучшая серия: максимальное количество подряд идущих дней, в течении которых количество шагов было равно или выше целевого.
    public int bestSeriesDay(int month) {
        int current = 0;
        int maxCurrent = 0;
        for (int i = 0; i < monthToData[month - 1].dayOfMonth.length; i++) {
            if (monthToData[month - 1].dayOfMonth[i] >= target) { //
                current ++;
                if (current > maxCurrent) {
                    maxCurrent = current;
                }
            } else {
                current = 0;
            }
        }
        return maxCurrent;
    }
    // Изменение целевого количества шагов.
    public void changeTarget(int changeTarget) {
        target = changeTarget;
    }
}
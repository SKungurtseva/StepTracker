public class Converter {
    // Метод преобразования шагов в километры.
    public double distancePerMonth(int sumStepMonth) {
        double distancePerMonth = sumStepMonth * 0.75 / 1000;
        return distancePerMonth;
    }
    // Метод преобразования шагов в калории.
    public double cCal(int sumStepMonth) {
        int cCal = sumStepMonth * 50 / 1000;
        return cCal;
    }
}


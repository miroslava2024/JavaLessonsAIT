package lesson16;


public class homewoorkVarargs {

    static int resalt = 0;
    public static void main(String[] args) {

        sum(2, 3,-54);
        statistics(12, 15, 24, 69);

    }

    public static void sum(int... numberN) {
        int sum = 0;
        for (int i : numberN) {
            sum += i;
        }
        System.out.println("Сумма равна " + sum);

    }

    public static void statistics(double... numbers) {
        double numberMax = numbers[0];
        double numberMin = numbers[0];
        double numberAverage = 0;
        double minNumber = getMinValue(numbers);
        double maxValue = getMaxValue(numbers);
        for (double number : numbers) {
            if (number < 0) {
                System.out.println("ERROR");
            } else {
                if (number > numberMax) {
                    numberMax = number;
                }

            }
            if (number < numberMin) {
                numberMin = number;
            }
            numberAverage += number;
        }
        numberAverage = numberAverage / numbers.length;
        System.out.println("Максимальное число " + numberMax);
        System.out.println("Минимальное число " + numberMin);
        System.out.println("Среднее число " + numberAverage);
        System.out.println("Минимальное число " + minNumber);
        System.out.println("Максимальное число " + maxValue);

    }

    public static double getMinValue(double... numbers) {
        double minValue = numbers[0];
        for (double number : numbers) {
            if (number < minValue) {
                minValue = number;
            }
        }
        return minValue;
    }

    public static double getMaxValue(double... numbers) {
        double maxValue = numbers[0];
        for (double number : numbers) {
            if (number > maxValue) {
                maxValue = number;
            }

        }
        return maxValue;


    }


}









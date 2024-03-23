package lesson18;

import static java.lang.System.*;

public class JavaArrays {
    public static void main(String[] args) {

        //тип_данных[] имя_массива
        //создали массив цен типа double размер 5

        double[] prices = new double[5];

        //создали массив возрастов сотрудников и заполнили его значениями
        int []age = {20,34,19,50,44};

        prices[0]=20.5;
        prices[1]= 40.5;
        prices[2]= 12.99;
        prices[3]= 4.0;
        prices[4]= 50;

        //выводим на экран первый элемент массива
       out.println(prices[0]);
        double secondElement = prices[1];
        out.println(secondElement);

        //получаем размер массива
        int length = prices.length;
        out.println(length);

        //вывод всех элементов массива на экран
        for(int i = 0; i < prices.length; i++){
            out.println(prices[i]);
        }
        out.println("--------for------");
        for(double preis: prices){
            out.println(preis);
        }

        double []newPrices = new double[prices.length];
        //копируем данные из prices в newPrices
        //System.arraycopy(массив откуда копируем, стартовый индекс для копирования,
        // в какой массив копируем, стартовый индекс для копирования в массиве куда копируем,
        // количество элементов);

        System.arraycopy(prices,0,newPrices,0, prices.length);

        out.println("----newPrices-----");
        for(double newprices:newPrices){
            out.println(newprices);
        }
        //клонирование массива
        double[]clonePrices = prices.clone();
        out.println("---ckolnePrices----");
        for(double cloneprices: clonePrices){
            out.println(cloneprices);
        }
 /*
        Представьте, что у вас есть массив `ratings`, содержащий рейтинги нескольких фильмов от 1 до 5.
         Напишите программу на Java, которая вычислит средний рейтинг всех фильмов в массиве.
         */

        out.println("---srednii reiting---");
        int []ratings = new int[5];
        ratings[0]= 2;
        ratings[1]= 6;
        ratings[2]= 3;
        ratings[3]= 1;
        ratings[4]= 5;

        int sum = 0;
        for(int rating: ratings){
            sum = sum + rating;
        }
        out.println(sum / ratings.length);











    }

}

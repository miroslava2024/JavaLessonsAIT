package lesson18;

import static java.lang.System.*;

public class JavaArrays {
    public static void main(String[] args) {
        //tip dannix [] imya massiva
        // sozdali massiv zen tipa double razmer 5
        double[] prices = new double[5];

        //cozdali massiv vozrastacotrudnikov
        // i zapolnili ego znazeniya
        int []age = {20,34,19,50,44};

        prices[0]=20.5;
        prices[1]= 40.5;
        prices[2]= 12.99;
        prices[3]= 4.0;
        prices[4]= 50;

        // vivodim na ikran pervii element massiva
       out.println(prices[0]);
        double secondElement = prices[1];
        out.println(secondElement);

        // poluzaem rasmer massiva
        int length = prices.length;
        out.println(length);

// vivod vsex elementov massiva na ikran
        for(int i = 0; i < prices.length; i++){
            out.println(prices[i]);
        }
        out.println("--------for------");
        for(double preis: prices){
            out.println(preis);
        }

        double []newPrices = new double[prices.length];
        // kopiruem dannie iz prisec v newPrices
        // cerez arraycopy(massiv okuda kopiruem, startovii indeks,
        // v kakou massiv kopiruem,startovii indeks, kolizestvo elementov
        System.arraycopy(prices,0,newPrices,0, prices.length);

        out.println("----newPrices-----");
        for(double newprices:newPrices){
            out.println(newprices);
        }
//klonirovanie massiva
        double[]clonePrices = prices.clone();
        out.println("---ckolnePrices----");
        for(double cloneprices: clonePrices){
            out.println(cloneprices);
        }
// vizislit crednee reiting 5 filmov
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

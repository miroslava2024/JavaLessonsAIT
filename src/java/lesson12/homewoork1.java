package lesson12;

import java.util.Scanner;

public class homewoork1 {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double a = 5;
        double b = 4;
        calkulateArea(a,b);
        calkulatePerimeter(a,b);

    }
    public static void calkulateArea(double a, double b){
        double multi = a * b;
        System.out.println("Площядь прямоугольника " + multi);


    }
    public static void calkulatePerimeter(double a, double b){
        double perimeter = 2 * a + b;
        System.out.println( "Периметер прямоугольника " + perimeter);
    }
}

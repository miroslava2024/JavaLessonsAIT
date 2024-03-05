package lesson12;

import java.util.Scanner;

public class homewoork1 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" length --> ");
        double a = scanner.nextDouble();
        System.out.println("weigth --> ");
        double b = scanner.nextDouble();
        double area = calkulateArea(a,b);
        double perimeter = calkulatePerimeter(a,b);
        System.out.println("Площядь прямоугольника " + area);
        System.out.println( "Периметер прямоугольника " + perimeter);
    }
    public static double calkulateArea(double a, double b){
        if(a >= 0 || b <= 0){
            System.out.println("ERROR");
            return -1;
        }
        return a * b;



    }
    public static double calkulatePerimeter(double a, double b){
        if(a >= 0 || b <= 0){
            System.out.println("ERROR");
            return -1;
        }
        return 2 *(a + b);

    }
}

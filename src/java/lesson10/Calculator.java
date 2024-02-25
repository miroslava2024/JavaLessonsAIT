package lesson10;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. сложение");
        System.out.println(" 2.вычитание ");
        System.out.println(" 3. умножение");
        System.out.println(" 4. деление");

        int operation = scanner.nextInt();
        System.out.println("Введите первое число ");
        int a = scanner.nextInt();
        System.out.println("Введите второе число ");
        int  b = scanner.nextInt();
        int result;
        if(operation ==1){
            result = a + b;
            System.out.println("результат " + result);
        }else if(operation == 2){
            result = a - b;
            System.out.println("результат " + result);
        }else if(operation == 3){
            result = a * b;
            System.out.println("результат " + result);
        }else if(operation == 4) {
            result = a / b;
            System.out.println("результат " + result);
        }else if(b == 0){

            System.out.println("На ноль делить нельзя ");
        }
        System.out.println("Хотите продолжить ? : da. net.");
        String answer = scanner.next();
        if(answer.equalsIgnoreCase("net")){

        }
        System.out.println("Конец");






    }
}

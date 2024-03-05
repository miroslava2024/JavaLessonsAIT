package lesson14;

import java.util.Scanner;

public class HomewoorkArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите номер: 1-Рисование, 2-Програмирование, 3-Спорт, 4-Рыбалка, 5-Вязание");

        String num = String.valueOf(scanner.nextInt());
        int number = scanner.nextInt();
        if(number == 1) {
            System.out.println("Рисование");
        }
        if(number == 2){
            System.out.println("Програмирование");
        }

        if(number == 3){
            System.out.println("Спорт");
        }

        if(number == 4){
            System.out.println("Рыбалка");
        }

        if(number == 5){
            System.out.println("Вязание");
        }
        else {
            System.out.println("Такого хобби нет в базе");
        }


        String[] hobby = new String [5];

        hobby[0] = "Рисование";
        hobby[1] = "Програмирование" ;
        hobby[2] = "Спорт";
        hobby[3] = "Рыбалка";
        hobby[4] = "Вязание";
        String  listHobby = hobby[0];
        String sumListHobby = String.valueOf(hobby.length);

        for(int i = 0; i < hobby.length; i++) {
            System.out.println(hobby [i]);

            if(i < 0 || i> 5 );
            System.out.println("");





















        }

    }
}

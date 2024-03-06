package lesson14;

import java.util.Scanner;

public class HomewoorkArray {
    private static String[] hobby = {"рисование", "программирование", "Спорт",
            "Рыбалка", "Вязание"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        listHobby();

        boolean foundHobby = findHobby("Чтение");
        if (foundHobby) {
            System.out.println("Хобби найдено");
        } else {
            System.out.println("Хобби не найдено");
        }

        System.out.println("Введите индекс хобби");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка, введите число");
            scanner.next();
        }
        int hobbyIndex = scanner.nextInt();
        indexHobby(hobbyIndex);


    }

    //Вывеctи все хобби на экран.
    public static void listHobby() {
        for (int i = 0; i < hobby.length; i++) {
            System.out.println(hobby[i]);
        }
    }

    //ищет в массиве заданное хобби
    public static boolean findHobby(String hobbyToFind) {
        boolean found = false;
        for (int i = 0; i < hobby.length; i++) {
            if (hobby.equals(hobbyToFind)) {
                found = true;
            }
        }
        return found;
    }

    //поиск через номер своего любимого хоббu
    public static void indexHobby(int number) {
        if (number < 0 || number >= hobby.length) {
            System.out.println("ERROR");
        } else {
            System.out.println(hobby);
        }
    }

}










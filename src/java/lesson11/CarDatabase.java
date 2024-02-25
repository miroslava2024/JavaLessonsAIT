package lesson11;

import java.util.Scanner;

public class CarDatabase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите марку автомобиля : ");
        String carBrand = scanner.next().trim();
        System.out.println("Введите год выпуска автомобиля: ");
        String countryOfOrigin;
        String carInfo;
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка, введите число ");
            scanner.next();
        }
        int yahr = scanner.nextInt();
        switch (carBrand.toLowerCase()) {
            case "ford":
                countryOfOrigin = "USA";
                if (yahr > 2010) {
                    carInfo = "Выпуск спорт у бизнес класса машин";
                } else {
                    carInfo = "Не много усовершенствованная система питания";
                }
                break;
            case "opel":
                countryOfOrigin = "Германия";
                if (yahr > 1990) {
                    carInfo = "Bыпуск новых моделеи: астра, вактра, корса";
                } else {
                    carInfo = "Опель кадет был самыи успешныи из моделеи";
                }
                break;
            default:
                countryOfOrigin = "Не нейдена";
                carInfo = "Нет информации";
                break;

        }
        printCarData(countryOfOrigin, carInfo);

    }
        public static void printCarData(String country, String info){
            System.out.println("Страна производитель " + country);
            System.out.println("Дополнительная информация " + info);
        }

        }




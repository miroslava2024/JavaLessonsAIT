package lesson18;

public class ChangeTypes {
    static String name = "Max";
    public static void main(String[] args) {

        int number = 3000;
        String numberString = String.valueOf(number);

        Integer numberTwo = Integer.valueOf(numberString);
        int numberThree = Integer.parseInt(numberString);

        System.out.println(numberString);
        System.out.println(numberTwo);
        System.out.println(numberThree);


        //строка-->число
        String numbersString = "34";
        int numberInt = Integer.parseInt(numbersString);
        System.out.println(numberInt - 4);

        //число-->строка
        //Integer.toString()
        //String.valueOf()
        int ageInt = 49;
        String ageString = String.valueOf(ageInt);
        System.out.println(ageString.concat(" years"));

        char charA = 97;
        char b = 'b';
        System.out.println(charA);
        System.out.println(name);


    }
}

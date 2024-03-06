package lesson15;

import static java.lang.String.format;

import java.util.Scanner;

public class homewoorkZoo {

    Scanner scanner = new Scanner(System.in);
    private static String[] animalSpecies = {"Лев", "Слон", "Обезьяна"};
    private static String[] animalSounds = {"Рык", "Трубление", "Крик"};


    public static void main(String[] args) {
        printAnimalSounds();
        boolean foundSound = findAnimalSound("Слон");
        if (foundSound) {
            System.out.println("Трубление");
        } else {
            System.out.println("Введите другое животное");
        }
    }

    public static void printAnimalSounds() {
        if (animalSpecies.length != animalSounds.length) {
            System.out.println("ERROR");
        } else {
            for (int i = 0; i < animalSpecies.length; i++) {
                String species = animalSpecies[i];
                String sounds = animalSounds[i];
                System.out.println("Животное: " + species +  " звук " + sounds);
            }
        }
    }

    public static boolean findAnimalSound(String soundToFind) {
        boolean found = false;
        for (int i = 0; i < animalSpecies.length; i++) {
            if (animalSounds.equals(soundToFind)) {
                found = true;
            }
        }
        return found;
    }


}

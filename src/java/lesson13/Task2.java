package lesson13;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {

/*
 Реализуйте метод, который принимает два массива целых чисел,
    и объединяет в один отсортированный массив.

    1,2,3,4 -arrayOne->
    6,7,8 --arrayTwo->
    <-sumArray- 1,2,3,4,6,7,8

 */

    }
    public  static  int [] sumArrays(int [] arrayOne, int [] arrayTwo){
         int [] sumArray = new int [arrayOne.length + arrayTwo.length];
         for( int i = 0; i < arrayOne.length; i ++){
             sumArray[i] = arrayOne[i];
         }
         for(int i = arrayOne.length; i < arrayTwo.length; i ++){
             sumArray[i + arrayOne.length] = arrayTwo[i];
        }
         return sumArray;



    }
    public static int[] sumArraysNew(int [] arrayOne,int [] arrayTwo){

        int[]sumArray = new int[arrayOne.length + arrayTwo.length];
        System.arraycopy(arrayOne,0,sumArray, 0, arrayOne.length);
        System.arraycopy(arrayTwo,0,sumArray, arrayOne.length, arrayTwo.length);
        Arrays.sort(sumArray);
        return sumArray;

    }



}

package lesson13;

public class JavaArrays {

    // tip[] nazvanie(konteinera)
/*
 Напишите метод, который принимает
          массив целых чисел и
          возвращает минимальное
           значение из этого массива.

 */
    public static void main(String[] args) {
        int[] salaryMax = {400, 350, 500, 200, 200};

        int[] salaryMaria = new int[6];
        salaryMaria[0] = 350;
        salaryMaria[1] = 400;
        salaryMaria[2] = 450;
        salaryMaria[3] = 470;
        salaryMaria[4] = 400;
        salaryMaria[5] = 490;

        int salaryMaxFirstMonth = salaryMax[0];
        int sizeSalarymax = salaryMax.length;
        //System.out.println("salaryMaxFirstMonth " + salaryMaxFirstMonth);
        //System.out.println("sizeSalarymax " + sizeSalarymax);


        for (int i = 0; i < salaryMaria.length; i++) {
            System.out.println(salaryMaria[i]);
        }

        for (int salary : salaryMaria) {
            System.out.println(salary);
        }

    }

    }





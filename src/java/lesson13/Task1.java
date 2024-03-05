package lesson13;

public class Task1 {
    public static void main(String[] args) {

        /*
 Напишите метод, который принимает
          массив целых чисел и
          возвращает минимальное
           значение из этого массива.

         */
        int[] salaryMaria = new int[7];
        salaryMaria[0] = 350;
        salaryMaria[1] = 400;
        salaryMaria[2] = 450;
        salaryMaria[3] = 470;
        salaryMaria[4] = 400;
        salaryMaria[5] = 490;
        salaryMaria[6] = 250;

        /*
        int minSalaryMaria = getMinSalary(salaryMaria);
        System.out.println(minSalaryMaria);
        System.out.println(checkElementsInArray(salaryMaria));

         */
        int[] firstArray = {1, 2, 3, 4};
        int[] secontArray = {6, 7, 8};


    }

    public static int getMinSalary(int[] salary) {
        int minSalary = salary[0];
        for (int i = 1; i < salary.length; i++) {
            if (salary[i] < minSalary) {
                minSalary = salary[i];
            }
        }
        return minSalary;
    }

    public static boolean checkElementsInArray(int[] elements) {
        //1,2,3,5,6,3,7,8
        for (int i = 0; i < elements.length - 1; i++) {
            if (elements[i + 1] < elements[i]) {
                return false;
            }
        }
        return true;


    }


}


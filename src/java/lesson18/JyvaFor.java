package lesson18;

public class JyvaFor {
    public static void main(String[] args) {
         /*
    for(инициализация; условие выполнения; обновление){
    код цикла для выполнения
    }
     */

            for (int i = 0; i <= 10; i++) {
                System.out.println(i);
            }
            for (int i = 20; i > 0; i = i - 2) {
                System.out.println(i);
            }

            int i=0, y= 10;
            for ( ; i < 10 && y >0; i++, y--){
                System.out.println(i + " " + y);
            }
            sum(20,40);


        }



        public static void sum (double a, int b){
            System.exit(1);
            System.out.println(a + b);


        }
}

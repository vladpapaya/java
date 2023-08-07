import java.util.Scanner;

public class hwwhile1_6 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число от 12 до 0");
        int userNumber = sc.nextInt();
        int sum = 0;
        while (userNumber != 0) {
//            System.out.println("Введите другое число");
//            int userNumber1 = sc.nextInt();
//            if (userNumber1 > 0) {
//                System.out.println("Введите другое число");
//            }
//            int userNumber2 = sc.nextInt();
//            if (userNumber2 > 0){
//                System.out.println("Введите 0");
//            }
//            int sum = userNumber + userNumber1 + userNumber2;
//            System.out.println("Сумма введенных чисел =" + " " + sum);
//            break;
            sum = userNumber + sum;
            userNumber = sc.nextInt();
        }
        //#1
        int a = 0;
        int b = 100;
        int random_number = a + (int) (Math.random() * b);
        System.out.println("угадай число от 1 до 100");
        int inputNumber = sc.nextInt();
        while (inputNumber != random_number){
//            System.out.println("не угадал, попробуй еще");
//            if (inputNumber > random_number){
//                System.out.println("попробуй меньше");
//            } else System.out.println("попробуй больше");
//            int inputNumber1 = sc.nextInt();
//            if (inputNumber1 > random_number){
//                System.out.println("попробуй меньше");
//            } else System.out.println("попробуй больше");
//            int inputNumber2 = sc.nextInt();
//            if (inputNumber2 > random_number){
//                System.out.println("попробуй меньше");
//            } else System.out.println("попробуй больше");
//            break;

            System.out.println("ERROR");

            inputNumber = sc.nextInt();
        }

        System.out.println("угадал");

        //#2
        System.out.println("Введите любое число");
        int numberByUser = sc.nextInt();
        int maxResult = numberByUser * 10;
        int i = 1;
        while (i != 0) {
//            System.out.println(numberByUser + " " + "*" + " " + "1 " + " = " + numberByUser * 1);
//            System.out.println(numberByUser + " " + "*" + " " + "2 " + " = " + numberByUser * 2);
//            System.out.println(numberByUser + " " + "*" + " " + "3 " + " = " + numberByUser * 3);
//            System.out.println(numberByUser + " " + "*" + " " + "4 " + " = " + numberByUser * 4);
//            System.out.println(numberByUser + " " + "*" + " " + "5 " + " = " + numberByUser * 5);
//            System.out.println(numberByUser + " " + "*" + " " + "6 " + " = " + numberByUser * 6);
//            System.out.println(numberByUser + " " + "*" + " " + "7 " + " = " + numberByUser * 7);
//            System.out.println(numberByUser + " " + "*" + " " + "8 " + " = " + numberByUser * 8);
//            System.out.println(numberByUser + " " + "*" + " " + "9 " + " = " + numberByUser * 9);
//            System.out.println(numberByUser + " " + "*" + " " + "10 " + " = " + numberByUser * 10);


            System.out.println(numberByUser + " " + "*" + " " + i + " = " + numberByUser * i);
            i++;
        }
        //#3

    }
}

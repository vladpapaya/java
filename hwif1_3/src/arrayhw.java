import java.util.Scanner;

public class arrayhw {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

//        int [] gradeArray = {1, 2, 3, 4, 5};
//        for (int grade = 1; grade <= gradeArray.length; grade++){
//            System.out.println(grade);
//        }
//        System.out.println("#1");
//        //#1
//        String[] workerName  = new String[] {"dima", "andrey", "cate", "sasha"};
//        for (int i = 0; i < workerName.length; i++) {
//            System.out.println(workerName[i]);
//        }
//        //#2
//        System.out.println("#2");
//        int [] numbers = new int [] {1, 7, 10, 5, 6, 11};
//        for (int a = 0; a < numbers.length; a++){
//            if (a %2 == 0){
//                System.out.println(numbers[a]);
//            }
//        }
//        System.out.println("#3");
//        //#3 - уточнить
//        int [] arc = {15,17,56,45,89,99,100};
//        int biggest = arc[0];
//        for (int k = 0; k < arc.length; k++){
//            if (arc[k] > biggest) {
//                biggest = arc[k];
//            }
//        }
//        System.out.println(biggest);
//        System.out.println("#4");
//        //#4
//        int [] aria = {6, 7, 10, 20, 21};
//        for (int g = 0; g < aria.length; g++){
//            if (aria[g]%2 == 0 && aria[g]%3 != 0){
//                System.out.println(aria[g]);
//            }
//        }
//        System.out.println("#5");
//        //#5
//        System.out.println("ввести число больше 7");
//        int input = sc.nextInt();
//        int i = 7;
//        while (input < i){
//            System.out.println("ввести другое число");
//            input = sc.nextInt();
//        }
//        while (i <= input) {
//            System.out.println(i);
//            i++;
//        }

//        System.out.println("введите число от 0 и больше");
        int input = sc.nextInt();
//        while (input < 0){
//            System.out.println("введите число от 0 и больше");
//            input = sc.nextInt();
//        }
        for (int i = 0; i <= input; i++) {
            System.out.println("i = " + i);
        }

        if (2>1) {
            System.out.println("верно");
        }
    }

}

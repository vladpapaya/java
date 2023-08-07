import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Введите целое число");
        int number = sc.nextInt();
        if (number %2 == 0) {
            System.out.println("Четное");
        } else {
            System.out.println ("Нечетное");
        }
        //#1
        System.out.println ("Сколько Вам лет?");
        int age = sc.nextInt();
        if (age <= 12) {
            System.out.println ("Ребенок");
        } else if (age <= 17) {
            System.out.println ("Подросток");
        } else {
            System.out.println ("Взрослый");
        }
        //#2
        System.out.println ("Сколько сейчас часов?");
        int actualTime = sc.nextInt();
        if(actualTime <= 4){
            System.out.println ("Доброй ночи");
        } else if (actualTime <= 11){
            System.out.println ("Доброе утро");
        } else if (actualTime <= 15){
            System.out.println ("Добрый день");
        } else if (actualTime <= 22){
            System.out.println ("Добрый вечер");
        }
        //#3
        System.out.println("Введите первое число");
        int a = sc.nextInt();
        System.out.println("Введите второе число");
        int b = sc.nextInt();
        System.out.println("Введите третье число");
        int c = sc.nextInt();
        int maxNumber = 0;
        if((a > b) && (a>c)){
            maxNumber = a;
        } else if((b>a) && (b>c)){
            maxNumber = b;
        } else if((c>a) && (c>b)){
            maxNumber = c;
        }
        System.out.println(maxNumber);
        //#4
        String triangle = "Треугольник";
        System.out.println("Введите первую строну треугольника");
        int ax = sc.nextInt();
        System.out.println("Введите вторую строну треугольника");
        int by = sc.nextInt();
        System.out.println("Введите третью строну треугольника");
        int cz = sc.nextInt();
        if((ax != by) && (ax != cz) && (by != cz)){
            System.out.println(triangle + "разносторонний");
        } else if((ax == by) && (ax == cz) && (by == cz)){
            System.out.println(triangle + "равносторонний");
        } else if((ax == by) || (by == cz) || (cz == ax)){
            System.out.println(triangle + " " + "равнобедренный");
        }
        //#5
        }

    }

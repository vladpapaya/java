import java.util.Scanner;
public class hwswitch1_4 {
    public static void main (String [] arg) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Введите цифру месяца");
        int month = scr.nextInt();
        switch (month) {
            case 1:
            case 2:
            case 3:
                System.out.println("1 квартал");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("2 квартал");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("3 квартал");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("4 квартал");
                break;
            default:
                System.out.println("некорректно");
        }
        //#1
        System.out.println("Введите цифру месяца");
        int monthX = scr.nextInt();
        switch (monthX) {
            case 12:
            case 1:
            case 2:
                System.out.println("зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("осень");
                break;
            default:
                System.out.println("не месяц");
        }
        //#2
        System.out.println("Введите первое число");
        int firstNumber = scr.nextInt();
        System.out.println("Введите второе число");
        int secondNumber = scr.nextInt();
        String askedNumber = scr.nextLine();//уточнить
        System.out.println("Что Вы хотите сделать с ними? (Разделить, умножить, сложить, вычесть)");

        String mathOperation = scr.nextLine();
        //уточнить

        switch (mathOperation) {
            case "Разделить":
                System.out.println(firstNumber / secondNumber);
                break;
            case "Умножить":
                System.out.println(firstNumber * secondNumber);
                break;
            case "Сложить":
                System.out.println(firstNumber + secondNumber);
                break;
            case "Вычесть":
                System.out.println(firstNumber - secondNumber);
                break;
            default:
                System.out.println("Ошибка)))");
        }
        //#3
        System.out.println("Введите тип фигуры: 1.Круг, 2.Квадрат, 3.Треугольник");
        int input = scr.nextInt();
        double square = 0;
        switch (input){
            case 1:
                System.out.println("Укажите радиус");
                int radius = scr.nextInt();
                square = Math.PI * radius * radius;
                break;
            case 2:
                System.out.println("Укажите сторону");
                int aSquare = scr.nextInt();
                square = aSquare * 4;
                break;
            case 3:
                System.out.println("Укажите высоту");
                int hTriangle = scr.nextInt();
                System.out.println("Укажите основание");
                int aTriangle = scr.nextInt();
                square = 0.5 * aTriangle * hTriangle;
                break;
            default:
                System.out.println("Введите число из списка.");
        }
        System.out.println("площадь "+ input + " - " + square);
        //№4
        }
    }

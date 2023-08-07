import java.util.Scanner;

public class test {
    public static void main (String [] arg){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int currentStep = 1;
        int result = 1;
        while(currentStep <= n) {
            result = result * currentStep;
            currentStep++;
        }
        System.out.println(result);
    }
}

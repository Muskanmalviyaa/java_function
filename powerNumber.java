import java.util.Scanner;

public class powerNumber {
    public static double userInput(double x,double n){
        double f = 1;
        double result = 0;
        for(double i=1;i<=n;i++){
             result = f*x;
            return result;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base number : ");
        double x = sc.nextInt();
        System.out.print("Enter exponent number : ");
        double n = sc.nextInt();
        
        double r = userInput(x, n);
        System.out.println("The power of X is = "+ r);
        sc.close();
    }
}

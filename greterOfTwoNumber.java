import java.util.Scanner;

public class greterOfTwoNumber {
    public static int printGreater(int a,int b){
        if(a>b){
            System.out.print("First no. is greater:");
        return 1;
        }
        else{
            System.out.print("Second no. is greater:");
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no. = ");
        int num1 = sc.nextInt();
        System.out.println("Enter second no. = ");
        int num2 = sc.nextInt();
        sc.close();
        printGreater(num1,num2);
    }
}

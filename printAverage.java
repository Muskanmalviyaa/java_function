import java.util.*;
public class printAverage{
    public static int calculateAverage(int a,int b,int c){
        int avg = (a+b+c)/3;
        return avg;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a three number:");
        int a =sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();
        sc.close();
        int average = calculateAverage(a,b,c);
        System.out.println("the avg of 3 no. is ="+ average);

    }
}
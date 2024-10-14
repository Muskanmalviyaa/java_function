import java.util.Scanner;

public class sumOfOddNumber{

    public static int sumOfOdd(int n){
       int sum = 0;
       for(int i=1;i<=n;i++){
        if(i % 2!=0){
            sum=sum+i;
          }
        }
        return sum;
  }
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
        System.out.println("Enten the number(n):");
       int n = sc.nextInt();
        int sum = sumOfOdd(n);
        System.out.println("sum of odd numbers from 1 to "+ n + " is: "+ sum);
        sc.close();
      
    
  }
}
 


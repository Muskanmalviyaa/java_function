import java.util.Scanner;

public class eligibleToVote {
    public static int printAge(int n){
        if(n>18){
            System.out.println("Eligible for vote:");
            return 1;
        }
        else{
            System.out.println("Not eligible for vote:");
            return 0;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enten the you AGE:");
        int n = sc.nextInt();
        sc.close();
        printAge(n);
    }
}

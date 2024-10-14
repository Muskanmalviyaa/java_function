import java.util.*;

public class programOfCount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many number you want: ");
        int n = sc.nextInt();
        int positivecount = 0;
        int negitivecount = 0;
        int zerocount = 0;
        System.out.println("Enter the element: ");
        for(int i=0;i<n;i++){
            int num = sc.nextInt();
            if(num>0){
                positivecount++;
            }else if(num<0){
                negitivecount++;
            }else{
                zerocount++;
            }
        }
        System.out.println("The count of positive number are = "+ positivecount);
        System.out.println("The count of negitive number are = "+ negitivecount);
        System.out.println("The count of zero number are = "+ zerocount);
        
        sc.close();
    }
 }


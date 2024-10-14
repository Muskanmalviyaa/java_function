import java.util.*;

public class cirOfCircle {
    public static double printCircle(double r){
      double pi = 3.14;
      double cir = 2*pi*r;

      return cir;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius: ");
        double r = sc.nextInt();
        double cir = printCircle(r);
        System.out.println("The circumferemce of circle: "+ cir); 
        sc.close();
    }
}

package ch1;
import java.util.Scanner;
public class if_else {
    public static void main(String[] args) {
        System.out.println("jay sree ram");
        
        
        Scanner obj = new Scanner(System.in);
        System.out.println("enter number");
            int a= obj.nextInt();
            System.out.println("enter second number");
            int b= obj.nextInt();

        if (a<b) {
            System.out.println("B is Bigger Then A");
        }

        else{
            System.out.println("A is Bigger Then B");
        }
    }
}

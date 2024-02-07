package ch1;
import java.util.Scanner;

import javax.swing.DefaultBoundedRangeModel;
class enum1 {
    

    public static void main(String[] args) {

        
        Scanner obj = new Scanner(System.in);

        System.out.println("welcome to over showroom ");

        System.out.println("select youtr choice");
        System.out.println("1.BIKE");
        System.out.println("2.CAR");

        int a = obj.nextInt();

        switch(a)
        {
            case 1 :
                System.out.println("you are choice BIKE");
                break;
            case 2 :
                System.out.println("you are choice CARE");
                break;
                
                default :
                    System.out.println("plice enter 1 to 3 number");
            
        }


        
    }
}

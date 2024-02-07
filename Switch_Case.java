import java.util.Scanner;
public class Switch_Case {
    
    public static void main(String[] args) {
         
        Scanner obj1 = new Scanner(System.in);

        System.out.println("welcome to over showroom ");
        System.out.println("select youtr choice");
        System.out.println("1.BIKE");
        System.out.println("2.CAR");

        int a = obj1.nextInt();

        switch(a)
        {
            case 1 :
                System.out.println("you are choice BIKE");
                Scanner obj2 = new Scanner(System.in);
                System.out.println("1.splendor");
                System.out.println("2.SP shine");
                System.out.println("3.discover");

                int a1 = obj1.nextInt();
                switch (a1)
                {
                    case 1 :
                        System.out.println("you selece splendor\n price | 1,05,000 |");
                        break;
                    case 2:
                        System.out.println("you selece sp shine \n price | 1,20,000 |");
                        break;
                    case 3:
                        System.out.println("you selece discover \n price | 95,000 |");
                        break;
                    
                }
                break;


            case 2 :
                System.out.println("you are choice CARE");
                break;
                
                default :
                    System.out.println("plice enter 1 or 2 number");
            
        }
        
    }
}

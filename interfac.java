import java.util.*;

interface bicyle
{
    void currentspeed(int curent);    
    void applybrake(int decrement);
    void speedup(int increment);
}

/* it's giv error
    ither impliment all methods or decler abstrect class

*/
// class aonecycle implements bicyle
// {
    
// }
 class aonecycle implements bicyle
{
        int currentspeed;
    public void currentspeed(int curent)
    {
         currentspeed = curent;

    }
     public void applybrake(int decrement)
    {
            int dec=decrement;
        
            System.out.println(" applying brake"+ (currentspeed-dec));
    }
    public void speedup(int increment)
    {
        int inc = increment;
            System.out.println("applying speedup"+ (currentspeed+inc));
    }
    

}



public class  interfac{

    public static void main(String[] args) {

        System.out.println("jay sree ram");

        Scanner s = new Scanner(System.in);
        int i = s.nextInt();

        aonecycle n = new aonecycle();
        n.currentspeed(i);
        n.applybrake(15);
        n.speedup(10);

    }
    
}

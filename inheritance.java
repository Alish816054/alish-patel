// this is single inheritance 
class one {
    
    float har =500;


}
class two extends one 
{
        float salary = 1000;
}
public class inheritance {
    
    public static void main(String[] args) {
        two obj = new two();
        System.out.println("salary"+obj.salary);
        System.out.println("har is "+obj.har);

    }
}

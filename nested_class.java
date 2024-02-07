class outer 
{
    int a=10;

    class inner
    {
            int b= 343;
    }

}


public class nested_class {
    
    public static void main(String[] args) 
    {
        outer o1 = new outer();
         outer.inner i1  = new outer().new inner();
        //or 
        // outer. inner i1  = o1. new outer().inner();

        System.out.println(o1.a);
        System.out.println("hello");
        System.out.println(i1.b);

    }


}

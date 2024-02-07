abstract class perent{

    perent()
    {
        System.out.println("me base  ka constroctor hu");

    }
    public void  hello()
    {
        System.out.println("hello");
    }
        abstract public void great();
}

class child extends perent
{
    public void great()
    {
        System.out.println("good morning");
    }
}


public class abstrectharry {
    
    public static void main(String[] args) {
            
            child n = new child();
            n.great();
            n.hello();

         

    }
}

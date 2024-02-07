// this is multilevel inheritance

class student
{
    float fees = 25500;
}

class  staff extends student
{
    float  har = 500;
        
    
}
class employ extends staff
{
    float  salary = 1000;
}

public class multilevelinheritance {
    
    public static void main(String[] args) {
        
        employ e = new employ();
        System.out.println("salsry"+e.salary);
        System.out.println("har"+e.har);
        System.out.println("fees"+e.fees);
    }
}

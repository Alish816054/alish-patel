class student 
{

    float fees = 12000;

}


public class object {

    int salary = 30000;
    public static void main(String[] args) {
        
        student s = new student();
        object o = new object();

        System.out.println("fees"+s.fees);
        System.out.println("salary"+o.salary); 
    }    

}

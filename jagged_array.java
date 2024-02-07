
public class jagged_array {
    
    public static void main(String[] args) {
        
            int days[][]={{1,2,3,4},{11,22},{11,12,13,14,15}};
            // days[0] = new int [3];
            // days[1] = new int [2];
            // days[0][0]=11;
            // days[0][1]=12;
            // days[0][2]=13;

            // days[1][0]=1;
            // days[1][1]=2;
            
            
            for (int i[]  : days) {
                
                for (int j =0; j<i.length;j++) {
                    
                    System.out.print(i[j]);
                }
                System.out.println(" ");
            }

    }
}

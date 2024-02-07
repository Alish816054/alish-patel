public class insertion {
   
    public static void main(String[] args) {
             int arr[] = {9,3,6,2,1};
             int current;
             int length =arr.length;

        for(int i=1; i<length; i++)
        {
             current = arr[i];
             int j=i-1;

             while(  j>=0 && arr[j]>current )
             {
                    arr[j+1]=arr[j];
                    j--;
              
             }
             arr[j+1] = current;
         
        }
        for(int l : arr)
        {
            System.out.println(l);
        }
    }
}

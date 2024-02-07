import java.util.*;

class booble1 {

    void short1(int arr[]) {
        int i;
        System.out.println("after short short");
        for (i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {
                    int temp;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }

            System.out.print(" " + arr[i]);
        }

    }
}

class booble {
    public static void main(String[] args) {

        int i;
        Scanner number = new Scanner(System.in);
        System.out.println("entr howmany number you enter");
        int a = number.nextInt();
        System.out.println(a);
        System.out.println("enter number");

        int[] arr = new int[a];

        for (i = 0; i < a; i++) {
            arr[i] = number.nextInt();
            System.out.println("befoure ");
            System.out.print("      " + arr[i]);

        }
        booble1 obj = new booble1();
        obj.short1(arr);

    }
}
                   
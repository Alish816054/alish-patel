import java.util.*;

public class select1 {
    public static void main(String[] args) {
        System.out.println("enter total elementof array");
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();
        int arr[] = new int[total];
        System.out.println(" enter array element");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();

        }
        for (int j : arr) {
            System.out.print(j);
        }

        // selection short
        for (int x = 0; x < arr.length - 1; x++) {
            int min = x;
            for (int y = x + 1; y < arr.length; y++) {
                if (arr[x] > arr[y]) {
                    min = y;
                }
            }
            int temp;
            temp = arr[min];
            arr[min] = arr[x];
            arr[x] = temp;
            System.out.println();
            for (int a : arr) {
                System.out.print(" " + a);
            }
        }

    }

}

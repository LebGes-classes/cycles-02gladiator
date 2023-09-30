import java.util.Scanner;
import java.lang.Math;

public class array1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите n: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n;i++){
            arr[i]= (int) (Math.random()*100);
            System.out.print(arr[i]+" ");

        }
    }
}

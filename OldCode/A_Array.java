import java.util.*;
public class A_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr= new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[0]=i;
            arr[1]=i+1;
            System.out.println(arr[i]);
        }
        System.out.println(Arrays.toString(arr));
    }
}

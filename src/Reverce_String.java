import java.util.Arrays;

public class Reverce_String {
    public static void main(String[] args){
        int[] array = {1,2,2,3,344,56};

        System.out.println("Normal array is : " + Arrays.toString(array));
        revercearray(array);
        System.out.println("Reverce array is : " + Arrays.toString(array));
    }

    public static void revercearray(int[] arr){
        int len = arr.length;
        for(int i =0;i<len/2;i++){
            int temp = arr[i];
            arr[i] = arr[len - 1-i];
            arr[len - 1 -i] = temp;
        }
    }
}

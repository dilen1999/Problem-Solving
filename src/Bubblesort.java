import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args ){
        int[] array = {12,23,43,1,3,4,5,343};
        Bubblesort(array);
        System.out.println("Sorted array is :" + Arrays.toString(array));
        for(int num:array){
            System.out.print(num + " ");
        }
    }

    public static void Bubblesort(int[] arr){
        int len = arr.length;
        boolean swapped;
        for(int i = 0; i< len-1;i++){
            swapped = false;
            for(int j=0;j<len-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}

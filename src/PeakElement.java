public class PeakElement {
    public static void main(String[] args){
        int[] array = {12,32,42,112,44,55,21};
        int[] result = PeakElement(array);
        System.out.println("Peak element is : " + result[0]);
        System.out.println("Mininum element is : " + result[1]);

    }
    public static int[] PeakElement(int[] arr){
        int max = arr[0];
        int min = arr[0];
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return new int[]{max,min};
    }
}

public class ReverseString {
    public static void main(String[] args){
        String charactoer = "hello world";
        System.out.println("Original String is : " + charactoer);
        System.out.println("Reverce String is : " + reverceString(charactoer));

    }
    public static String reverceString(String str){
        char[] characterArray = str.toCharArray();
        int left = 0;
        int right = characterArray.length-1;
        while(left<right){
            char temp = characterArray[left];
            characterArray[left] = characterArray[right];
            characterArray[right] = temp;
            right--;
            left++;
        }
        return new String(characterArray);
    }
}

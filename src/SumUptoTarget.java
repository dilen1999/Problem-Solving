public class SumUptoTarget {
        public static void main(String[] args){
            int[] array = {12,23,12,33,44,22,1,3,4};
            int target = 40;
            SumuptoTarget(array,target);
        }
        public static void SumuptoTarget(int[] num, int target){
            for(int i =0; i < num.length; i++){
                for(int j = i + 1; j <num.length;j++){
                    if((num[i]+num[j])>=target){
                        System.out.println("("+num[i]+","+num[j]+")");
                    }
                }
            }
        }
}

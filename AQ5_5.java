import java.util.Arrays;

public class AQ5_5 {
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 2, 4, 2, 5};
        int target=2;
        int ans=countOccurence(arr,target);
        System.out.println(Arrays.toString(arr));
        System.out.println("Element occurs "+ans+" times.");
    }
    private static int countOccurence(int[] arr,int target){
        int occurence=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]==target) {
                occurence++;
            }
        }
        return occurence;
    }
}

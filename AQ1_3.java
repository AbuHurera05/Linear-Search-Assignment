import java.util.Arrays;

public class AQ1_3 {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 20, 40 };
        int target = 20;
        int occurence = find(arr, target);
        System.out.println("Array: "+Arrays.toString(arr));
        System.out.println("Last Occurence: "+occurence);
    }

    private static int find(int[] arr, int target) {
        int occurence=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]==target) {
                occurence=i;
            }
            
        }
        if (arr[occurence]==target) {
            return occurence;
        }
        return -1;
    }
}
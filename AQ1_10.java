public class AQ1_10 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,0,6,4,5};
        isSorted(arr);
    }
    private static void isSorted(int[] arr){
        int j=1;
        for(int i=0;i<arr.length-1;i++){
            if (arr[i] > arr[j]) {
                System.out.println("Array is unsorted.");
                return;
            }
            j++;
        }
        System.out.println("Array is sorted.");
    }
}

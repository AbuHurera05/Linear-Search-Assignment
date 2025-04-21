public class AQ1_7 {
    public static void main(String[] args) {
        int[] arr={5, 1, 7, 3, 9, 2};
        int a=maxElement(arr);
        System.out.println("Minimum element is "+a);
    }
    private static int maxElement(int[] arr){
        int min= arr[0];
        for(int i = 0;i<arr.length;i++){
            if (arr[i]<min) {
                min=arr[i];
            }
        }
        return min;
    }
}

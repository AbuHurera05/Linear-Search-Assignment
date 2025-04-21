public class AQ1_6 {
    public static void main(String[] args) {
        int[] arr={5, 1, 7, 3, 9, 2};
        int a=maxElement(arr);
        System.out.println("Maximum element is "+a);
    }
    private static int maxElement(int[] arr){
        int max= arr[0];
        for(int i = 0;i<arr.length;i++){
            if (arr[i]>max) {
                max=arr[i];
            }
        }
        return max;
    }
}

public class AQ1_8 {
    public static void main(String[] args) {
        int[] arr={5, 1, 7, 3, 9, 2};
        int target=5;
        findElement(arr,target);
        
       
    }
    private static void findElement(int[] arr,int target){
       for (int i : arr) {
            if (i==target) {
                System.out.println("Element found.");
                return;
            }
       }
       System.out.println("Element Not found.");
    }
}

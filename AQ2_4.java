public class AQ2_4 {
    public static void main(String[] args) {
        int[] arr={1,3,4,5,6,7};
        int a=missingElement(arr);
        System.out.println(a);
    }
    public static int missingElement(int[] arr){
        int first=arr[0];
        
        for (int i : arr) {
            if (i!=first) {
                return first;
            }
            first++;   
        }
        return -1;
    }

}

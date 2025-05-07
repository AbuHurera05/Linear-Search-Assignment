public class AQ2_3 {
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 2, 4, 1, 5};
        uniqueElement(arr);
    }
    private static void uniqueElement(int[] arr){
        
        for (int i = 0; i < arr.length; i++) {
            boolean b=true;
            for (int j = 0; j < arr.length; j++) {
                if (i!=j && arr[i]==arr[j]) {
                    b=false;
                    break;
                   
                }
                
            }
            if (b) {
                System.out.print(arr[i]+" ");
            }
        }
    }
}

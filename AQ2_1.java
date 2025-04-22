
public class AQ2_1 {
    public static void main(String[] args) {
        int[] arr={10, 15, 19,20,21, 5, 15, 25};
        int max=secondMaxElement(arr);
        System.out.println(max);
    }
    private static int secondMaxElement(int[] arr){
        int max=arr[0];
        int seconMax=arr[0];
        for(int i=0; i < arr.length; i++){
            if (arr[i] > max ) {
                seconMax=max;
                max=arr[i];
            }
            else if (arr[i] > seconMax && arr[i] != max) {
                seconMax=arr[i];
            }
        }
        return seconMax;

    }
}
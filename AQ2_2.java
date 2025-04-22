public class AQ2_2 {
    public static void main(String[] args) {
        int[] arr={10, 20, 5, 15, 25};
        int max=secondMaxElement(arr);
        System.out.println(max);
    }
    private static int secondMaxElement(int[] arr){
        int min=arr[0];
        int seconMin=arr[0];
        for(int i=0; i < arr.length; i++){
            if (arr[i] < min ) {
                seconMin=min;
                min=arr[i];
            }
            else if (arr[i] < seconMin && arr[i] != min) {
                seconMin=arr[i];
            }
        }
        return seconMin;

    }
}
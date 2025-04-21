public class AQ1_1 {

    public static void main(String[] args) {
        int arr[]={20,30,40,50,60};
        int target=60;
        int index=find(arr,target);
        System.out.println(index);
    }
    private static int find(int[] arr,int index){
        int j=0;
        for (int i : arr) {
            if (i==index) {
                return j;
            }
            j++;
        }
        return -1;
    }
}
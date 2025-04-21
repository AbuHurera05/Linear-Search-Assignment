import java.util.Arrays;

public class AQ1_4 {
    public static void main(String[] args) {
        int matrix[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int target=10;
        System.out.println(Arrays.deepToString(matrix));
        int[] index=findElementIndex(matrix,target);
        System.out.println(Arrays.toString(index));
    }
    private static int[] findElementIndex(int[][] arr,int target){
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                if (arr[i][j]==target) {
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }
}

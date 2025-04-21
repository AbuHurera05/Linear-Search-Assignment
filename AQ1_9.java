public class AQ1_9 {
    public static void main(String[] args) {
        String str="hellow";
        char target='e';
        int index=findCharacter(str,target);
        System.out.println("Character found at index: "+index);
    }
    public static int findCharacter(String str,char target){
        for(int i=0;i<str.length();i++){
            if (str.charAt(i)==target) {
                return i;
            }
        }
        return -1;
    }
}

public class C1_LinearS {
    public static void main(String[] args) {
        int[] nums={23,55,1,56, 44,9};
        int target =9;
        int ans= linearsearch(nums, target);
        System.out.println(ans);
    }
    static int linearsearch(int[] arr, int target){
        if ( arr.length== 0){
            return -1;
        }

        for(int i=0;i<arr.length;i++){
            int element =arr[i];
            if(element== target){
                return i;
            }
        }
        return -1;
    }
}

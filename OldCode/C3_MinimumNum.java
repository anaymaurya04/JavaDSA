public class C3_MinimumNum {
    public static void main(String[] args) {
        int[] arr={23,545,11,5,676,33,27};
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        int ans= arr[0];
        for (int j : arr) {
            if (j < ans) {
                ans = j;
            }
        }
        return ans;
    }
}

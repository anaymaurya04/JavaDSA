public class FindMin {
    public static void main(String[] args) {
        int[] a= {21,32,55,2,56,7,121,21};
        int ans=min(a);
        System.out.println(ans);
    }

    static int min(int[] a) {
        int ans = a[0];
        for (int i = 0; i < a.length;i++) {
            if (ans > a[i]) {
                ans = a[i];
            }
        }
        return ans;
    }

}

public class SearchRange {
    public static void main(String[] args) {
            int[] a={21,34,56,12,11,3,54,74,77,42};
            int target=3;
            int start=2;
            int end=9;
            int ans=linearsearch(a, target, start, end);
            System.out.println(ans);
    }

    static int linearsearch(int[] a, int target, int start, int end) {
        if (a.length == 0) {
            return -1;
        }
        for (int index = start; index <= end; index++) {
            if (target == a[index]) {
                return index;
            }
        }
        return -1;
    }
}

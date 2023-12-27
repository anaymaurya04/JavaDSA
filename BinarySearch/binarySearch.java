package BinarySearch;

class binarySearch {
    public static void main(String[] args) {
        int[] arr ={3,6,9,11,23,55,66,889,2221};
        int target =889;
        int ans = binarysearch(arr, target);
        System.out.println(ans);
    }

    static int binarysearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(target<arr[mid]){
                end =mid-1;
            }
            else if (target>arr[mid]) {
                start = mid +1;
            }
            else {
                return mid;
            }
        }
    return -1;}

}
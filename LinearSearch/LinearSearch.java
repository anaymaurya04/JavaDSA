public class LinearSearch {

    public static void main(String[] args) {
        int[] a={2,4,6,1,56,11,678,121,35};
        int target=56;
        int ans= linearsearch(a, target);
        System.out.println(ans);
    }
    static int linearsearch (int[] a,int target){
        if (a.length==0){
            return -1;
        }
        for( int index =0; index < a.length; index++){
            if(target==a[index]){
                return index;
            }
        }
        return -1;
    }
}
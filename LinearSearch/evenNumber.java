public class evenNumber {
    public static void main(String[] args) {
        int[] nums={32,554,778,2222};
        int ans = findNumbers(nums);
        System.out.println(ans);
        
    }
    static int findNumbers(int[] nums){
        int count=0;
        for (int num:nums) {
            if(even(num)){
                count ++;
            }
        }
        return count;
    }
     static boolean even(int num) {
        if (digits(num)%2==0) {
            return true;
        }
        return false;
    }
     static int digits(int num) {
        int count=0;
        while (num>0) {
            num /= 10;
            count++;
        }
        return count;
    }
    
}

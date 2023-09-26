public class C2_StringQuestion {
    public static void main(String[] args) {
        String name = "Anay";
        char target= 'a';
        System.out.println(searchString(name,target));
        System.out.println(search(name,target));
    }
    static boolean searchString(String str, char target){
        if(str.isEmpty()){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(target==str.charAt(i)){
                return true;
            }
        }
        return false;
    }
    static int search(String str, char target) {
        if(str.isEmpty()){
            return -1;
        }
        for (int i = 0; i < str.length(); i++) {
            if(target==str.charAt(i)){
                return i;
            }
        }
        return 0;
    }
}

public class StringLS {
    public static void main(String[] args) {
        String s="My little pony";
        char t = 't';
        System.out.println(stringsearch(s, t));
    }
    static boolean stringsearch(String s, char t){
        if(s.length()==0){
            return false;
        }
        for(int i=0; i<s.length();i++){
            if (t==s.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}

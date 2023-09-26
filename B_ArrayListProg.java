import java.util.*;
public class B_ArrayListProg {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(54);
        list.add(3);
        list.add(92);
        list.add(2,54);
        list.add(1,34);
        list.add(3);
        list.set(0,4);
        System.out.println(list);
    }
}

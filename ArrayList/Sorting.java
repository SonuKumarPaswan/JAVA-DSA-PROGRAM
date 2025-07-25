import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    public static void sortArrayList(ArrayList<Integer> list) {
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(15);
        list.add(9);
        list.add(5);
        System.out.println(list);
        sortArrayList(list);
        System.out.println(list);
    }
}

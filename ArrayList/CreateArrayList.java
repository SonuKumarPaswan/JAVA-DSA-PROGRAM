import java.util.ArrayList;

public class CreateArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // how to add element in arraylist
        list.add(2);
        list.add(5);
        list.add(3);
        list.add(9);
        list.add(7);
        list.add(1);
        // System.out.println(list.size());
        System.out.println(list);

        // get the element
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
        // how to remove the element from ArrayList
        list.remove(2);
        System.out.println(list);

        // Set element in perticular index
        list.set(2, 18);
        System.out.println(list);

        // contains ---- check element exist or not --- if element is exist the return
        // true otherwise false
        System.out.println(list.contains(2));
        System.out.println(list.contains(11));
        System.out.println(list.contains(1));

    }
}
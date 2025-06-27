import java.util.ArrayList;

public class Maximum {
    public static void getMaximum(ArrayList<Integer> list) {
        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            // if (list.get(i) > max) {
            // max = list.get(i);
            // }
            max = Math.max(max, list.get(i));
        }
        System.out.println("Maximum Element is : " + max);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(15);
        list.add(89);
        list.add(5);
        getMaximum(list);

    }
}

import java.util.ArrayList;

public class SwapTwoElem {
    public static ArrayList<Integer> swapElem(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(15);
        list.add(89);
        list.add(5);

        System.out.println(swapElem(list, 2, 0));
    }

}

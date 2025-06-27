import java.util.ArrayList;

public class PainrSum {
    public static boolean pairSum(ArrayList<Integer> list, int target) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == target) {
                    return true;
                }
            }
        }
        return false;
    }

    // 2nd approach ---- by using two poiter approach
    public static boolean pairSum2(ArrayList<Integer> list, int target) {
        int lpoiter = 0;
        int rpoiter = list.size() - 1;
        while (lpoiter < rpoiter) {
            int sum = list.get(lpoiter) + list.get(rpoiter);
            if (sum == target)
                return true;
            if (sum < target) {
                lpoiter++;
            } else {
                rpoiter--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 59;
        System.out.println(pairSum2(list, target));
    }
}

public class CountWordFrequncy {
    public static void main(String[] args) {
        String s1 = "Mohan is here and sohan is not here so ";
        System.out.println(s1);
        getWordFrequency(s1);
    }

    public static void getWordFrequency(String s1) {
        String[] str = getWord(s1);
        int n = str.length;
        for (int i = 0; i < n - 1; i++) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (str[i].equalsIgnoreCase(str[j])) {
                    count++;
                    str[j] = str[n - 1];
                    j--;
                    n--;
                }
            }
            System.out.println(str[i] + " :  Word is :" + count + " times");
        }

    }

    public static String[] getWord(String s1) {
        String[] q = new String[countWord(s1)];
        String word = "";
        int j = 0;
        for (int i = 0; i < s1.length(); i++) {
            char x = s1.charAt(i);
            if (x != ' ')
                word = word + x;
            if ((x == ' ' && !word.isBlank()) || i == s1.length() - 1) {
                q[j++] = word;
                word = "";
            }
        }
        return q;
    }

    public static int countWord(String s1) {
        String word = "";
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            char x = s1.charAt(i);
            if (x != ' ')
                word = word + x;
            if ((x == ' ' && !word.isBlank()) || i == s1.length() - 1) {
                count++;
                word = "";
            }
        }
        return count;
    }
}

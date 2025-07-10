import java.util.Stack;

public class ReverseStack {
    public static void pushBottom(Stack<Integer> st, int data) {
        if (st.isEmpty()) {
            st.push(data);
            return;
        }
        int top = st.pop();
        pushBottom(st, data);
        st.push(top);
    }

    public static void reverseStack(Stack<Integer> st) {
        if (st.isEmpty()) {
            return;
        }
        int top = st.pop();
        reverseStack(st);
        pushBottom(st, top);

    }

    public static void display(Stack<Integer> s) {
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }

    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st);
        // display(st);
        pushBottom(st, 4);
        reverseStack(st);
        // display(st);
        System.out.println(st);
    }

}

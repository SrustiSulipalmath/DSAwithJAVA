import java.util.*;

public class stackOperations {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        //add
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        //peek
        System.out.println(st.peek());

        //remove
        st.pop();
        System.out.println(st.pop());

        System.out.println(st.peek());
        System.out.println(st.size());
    }
    
}
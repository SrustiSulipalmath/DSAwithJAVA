import java.util.*;
public class reverseFirstKOfQ {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();

        //add in queue
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(25);
        queue.offer(40);
        queue.offer(50);

        for(int i =0;i<queue.size();i++){
            System.out.println(queue.peek());
        }
        reverse(queue,3);

       
        
    }
    public static void reverse(Queue<Integer> queue,int k){
        Stack<Integer> st = new Stack<>();

        for(int i =0;i<k;i++){
            st.push(queue.remove());

        }
        for(int i=0;i<k;i++){
            queue.offer(st.pop());

        }
        int count = queue.size() - k;
        for(int i=0;i<count;i++){
            queue.offer(queue.remove());
        }
    }
}

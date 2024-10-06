import java.util.*;
public class queueOperations {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();

        //add in queue
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(25);

        //gey the front element
        System.out.println(queue.peek());

        //remove element

        System.out.println(queue.remove()); //removes and return element
        System.out.println(queue.peek());
        System.out.println(queue.size());
    }
}

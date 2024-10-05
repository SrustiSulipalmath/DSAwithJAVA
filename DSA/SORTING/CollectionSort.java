import java.util.*;

public class CollectionSort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(10);
        list.add(50);
        list.add(40);
        list.add(70);
        list.add(60);

        System.err.println(list);

        Collections.sort(list);

        System.out.println(list);

    }
}

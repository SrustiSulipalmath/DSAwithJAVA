import java.util.ArrayList;
public class arrayListOperations{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);
        list.add(1,40);
        System.out.println(list);
        System.out.println(list.get(2));
        list.remove(2);
        System.out.println(list.size());
        list.set(1,60);
        System.out.println(list.toString());


    }
}

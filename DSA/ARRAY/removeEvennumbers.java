import java.util.*;
public class removeEvennumbers {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(3);
        list.add(5);
        System.out.println(list);
        RemoveEven(list);
        System.out.println(list);

        
    }
    public static void RemoveEven(ArrayList<Integer>list){
        for(int i=list.size()-1;i>=0;i--){
            if(list.get(i)%2==0){
                list.remove(i);
            }
        }
    }
    
}

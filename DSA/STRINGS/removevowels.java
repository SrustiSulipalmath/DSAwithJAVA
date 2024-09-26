
public class removevowels{
    public static void main(String[] args) {
        String st1 ="welcometoscaler";
        String st2="youcandoit";

        for(int i =0;i<st1.length();i++){
            char ch = st1.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                continue;
            }
            System.out.print(ch);
        }
        System.out.println();
        for(int i =0;i<st2.length();i++){
            char ch = st2.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                continue;
            }
            System.out.print(ch);
        }
    }
}
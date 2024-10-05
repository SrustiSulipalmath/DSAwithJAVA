public class removeAtIndx {
    static class Node{
        int data;
        Node next;

        Node(int val){
            this.data = val;
        }
    }

        public static void main(String[] args) {
            Node n1 = new Node(10);
            Node n2 = new Node(20);
            Node n3 = new Node(30);
            Node n4 = new Node(40);
            Node n5 = new Node(50);
    
            n1.next=n2;
            n2.next=n3;
            n3.next=n4;
            n4.next=n5;
    
            Node head = n1;
    
            head = RemoveAtPos(head,3);
    
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
    
    
        }
        public static Node RemoveAtPos(Node head,int idx){
            Node temp = head;
            for(int i=1;i<idx-1;i++){
                temp=temp.next;
            }
            Node tempp1 =temp.next.next;
            temp.next = tempp1;
            return head;
        }
}

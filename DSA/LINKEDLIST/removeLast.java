public class removeLast {
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
    
            head = RemoveLast(head);
    
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
    
    
        }

        public static Node RemoveLast(Node head){
            Node temp = head;
            if(head==null){
                return null;
            }
            if(head.next==null){
                return null;
            } 
            while(temp.next.next!=null){
                temp = temp.next;
            }
            temp.next =null;
            return head;
           
        }
}

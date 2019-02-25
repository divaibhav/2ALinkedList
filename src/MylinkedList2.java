class Node{
    int data;
    Node next;
}


public class MylinkedList2 {
    Node head;
    int size;

    //inserting a new node at the end
    void insert(Node newnode){
        System.out.println("inserting new node "+newnode.data);
        if(head==null){
            head=newnode;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
        }
    }
    //function to display linkedlist
    void display(){
        System.out.println("MyLinkedList:");
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"--->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        MylinkedList2 linkedlist=new MylinkedList2();
        Node newnode=new Node();
        newnode.data=10;
        newnode.next=null;

        Node n1=new Node();
        n1.data=454;
        n1.next=null;

        Node n2=new Node();
        n2.data=345;
        n2.next=null;

        Node n3=new Node();
        n3.data=987;
        n3.next=null;

        linkedlist.insert(newnode);
        linkedlist.insert(n1);
        linkedlist.insert(n2);
        linkedlist.insert(n3);
        linkedlist.display();

        Node n4=new Node();
        n4.data=98675;
        n4.next=null;
        linkedlist.insertAtBeginning(n4);
        linkedlist.display();
        linkedlist.delete();
        linkedlist.display();
        linkedlist.deleteFromBeginning();
        linkedlist.display();



    }

    void insertAtBeginning(Node newnode){
        System.out.println("inserting new node a beginning "+newnode.data);

            newnode.next=head;
            head=newnode;

    }
    //deleting from last
    void delete(){
        if(head==null){
            System.out.println("empty list");
        }
        else{
            Node current=head;
            Node previous=null;
            while(current.next!=null){
                previous=current;
                current=current.next;
            }
            System.out.println("deleting last node "+current.data);
            previous.next=null;
        }
    }
    void deleteFromBeginning(){
        if(head!=null) {
            System.out.println(head.data);
            head = head.next;
        }
    }















}

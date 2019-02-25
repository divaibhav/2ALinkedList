/*
Creating a linked list. A linked list is a linear collection
of data elements. These data elements are called as nodes.



A linked list can be viewed as a sequence of nodes in which each
node contains one or more data fields and a reference to the next node.

To created a linked list we have to create a node.

In Java we will create node by creating a class called Node.

Node class will contain a data field and  a reference field.

Here we are creating a linked list of integer,
so each node can contain only one data field called data and
one reference field called next.

 */

//creating Node class

/*class Node{
    //field to store integer value
    int data;
    // reference to store reference of next node
    Node next;
}*/
// this class is our linked list class which contains sequence of nodes
/*public class MyLinkedList {
    // field to point our linked list or we can say start of list
    Node head;
    //optional field to keep track of total number of elements in linked list
    int length;

    //now we can create insert method to add new node in linked list
    //we can add new node at the beginning of list
    //we can add new node at the end of list
    //we can add new node in-between two existing node before a node or after a node
    //insert at end most common for list
    void insert(Node newnode){
        //if there no element in list head should point the very first element
        if(head==null){
            head=newnode;
            //increase length
            length++;

        }
        else{
            //if linked list contains any element you have to reach the end of list
            // to insert new element
            Node temp=head;//because we don't want to change the value of head

            while(temp.next!=null){
                temp=temp.next;
            }
            //now temp is at last node, so we can add reference of newnode in temp next field.
            temp.next=newnode;
            //increase length
            length++;

        }
    }

    //a display method print our linked list
    //to dispay list we have to travers all node and print the data
    void display(){
        Node temp = head;
        while (temp != null) {

            System.out.print(temp.data + "--->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    }

*/
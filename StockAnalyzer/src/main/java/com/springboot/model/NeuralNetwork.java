package com.springboot.model;

public class NeuralNetwork 
{
public Node head; // head of list
String sequence;
/* Linked list Node*/

// An utility function to merge two sorted linked lists
/* Utility function to insert a node at begining of the
linked list */
public Node push(Node head_ref, int prob,String sequence)
{
/* 1 & 2: Allocate the Node &
Put in the data*/
Node new_node = new Node(sequence,prob);

/* 3. Make next of new Node as head */
if(sequence.substring(sequence.length() - 1)=="u")
{
new_node.up = head_ref;

}
if(sequence.substring(sequence.length() - 1).equals("d"))
{
new_node.down = head_ref;

}
/* 4. Move the head to point to new Node */
head_ref = new_node;

/*5. return to link it back */
return head_ref;
}

public void printList()
{
    Node temp = head;
    while (temp != null)
    {
        System.out.print(temp.prob);
        if(temp.up!=null)
        {
            temp = temp.up;
        }
        if(temp.down!=null)
        {
            temp = temp.down;
        }    
        else
        {
            temp = null;
        }
    }
    System.out.println();
}

/* Drier program to test above functions */
} /* This code is contributed by Rajat Mishra */

/******************Access to the Api******************/


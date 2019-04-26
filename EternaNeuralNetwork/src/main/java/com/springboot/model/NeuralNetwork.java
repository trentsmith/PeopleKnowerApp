package com.springboot.model;

public class NeuralNetwork 
{
public Node head; // head of list
String puzzle;
/* Linked list Node*/

// An utility function to merge two sorted linked lists
/* Utility function to insert a node at begining of the
linked list */
public Node push(Node head_ref, String ans,String puzzle)
{
/* 1 & 2: Allocate the Node &
Put in the data*/
Node new_node = new Node(ans,puzzle);

/* 3. Make next of new Node as head */
if(puzzle.substring(puzzle.length() - 1)==".")
{
new_node.dot = head_ref;

}
if(puzzle.substring(puzzle.length() - 1).equals(")")||puzzle.substring(puzzle.length() - 1).equals("("))
{
new_node.line = head_ref;

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
        System.out.print(temp.ans);
        if(temp.dot!=null)
        {
            temp = temp.dot;
        }
        if(temp.line!=null)
        {
            temp = temp.line;
        }    
        else
        {
            temp = null;
        }
    }
    System.out.println();
}

/* Drier program to test above functions */
} 

/******************Access to the Api******************/


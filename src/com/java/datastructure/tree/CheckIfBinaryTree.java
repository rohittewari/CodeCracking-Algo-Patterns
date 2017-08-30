package com.java.datastructure.tree;

//A full binary tree is defined as a binary tree in which all nodes have either zero or two child nodes.

/*  Tree node structure */
class Node 
{
    int data;
    Node left, right;
  
    Node(int item) 
    {
        data = item;
        left = right = null;
    }
}
  
public class CheckIfBinaryTree 
{
    Node root;
      
    /* this function checks if a binary tree is full or not */
    boolean isFullTree(Node node)
    {
        // if empty tree
        if(node == null)
        return true;
          
        // if leaf node
        if(node.left == null && node.right == null )
            return true;
          
        // if both left and right subtrees are not null
        // the are full
        if((node.left!=null) && (node.right!=null))
            return (isFullTree(node.left) && isFullTree(node.right));
          
        // if none work
        return false;
    }
  
      
    // Driver program
    public static void main(String args[]) 
    {
        CheckIfBinaryTree tree = new CheckIfBinaryTree();
       /* tree.root = new Node(10);
        tree.root.left = new Node(20);
        tree.root.right = new Node(30);
        tree.root.left.right = new Node(40);
        tree.root.left.left = new Node(50);
        tree.root.right.left = new Node(60);
        tree.root.left.left.left = new Node(80);
        tree.root.right.right = new Node(70);
        tree.root.left.left.right = new Node(90);
        tree.root.left.right.left = new Node(80);
        tree.root.left.right.right = new Node(90);
        tree.root.right.left.left = new Node(80);
        tree.root.right.left.right = new Node(90);
        tree.root.right.right.left = new Node(80);
        tree.root.right.right.right = new Node(90);*/
        
        Node n10 = new Node(10);
        Node n20 = new Node(20);
        Node n30 = new Node(30);
        Node n40 = new Node(40);
        Node n50 = new Node(50);
        Node n60 = new Node(60);
        Node n70 = new Node(70);
        Node n80 = new Node(80);
        Node n90 = new Node(90);
        
        
        tree.root = n10;
        n10.left = n20;
        n10.right = n30;
        
        n20.left = n40;
        n20.right=n50;
        
        
        
        
        
          
        if(tree.isFullTree(tree.root))
            System.out.print("The binary tree is full");
        else
            System.out.print("The binary tree is not full"); 
    }
}
  
// This code is contributed by Mayank Jaiswal 
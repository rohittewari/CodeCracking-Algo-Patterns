package MyCodes.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
	
	TreeNode root;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int heightOfBinaryTree(TreeNode node)
	{
	    if (node == null)
	    {
	        return 0;
	    }
	    else
	    {
	        return 1 +
	        Math.max(heightOfBinaryTree(node.left),
	            heightOfBinaryTree(node.right));
	    }
	}
	
	
	
	public static TreeNode createBinaryTree()
	 {
	  
	  TreeNode rootNode = new TreeNode(40);
	  TreeNode node20=new TreeNode(20);
	  TreeNode node10=new TreeNode(10);
	  TreeNode node30=new TreeNode(30);
	  TreeNode node60=new TreeNode(60);
	  TreeNode node50=new TreeNode(50);
	  TreeNode node70=new TreeNode(70);
	  
	  rootNode.left=node20;
	  rootNode.right=node60;
	  
	  node20.left=node10;
	  node20.right=node30;
	  
	  node60.left=node50;
	  node60.right=node70;
	  
	  return rootNode;
	 }

	

}

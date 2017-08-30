package MyCodes.Tree;

import java.util.LinkedList;
import java.util.Queue;

import MyCodes.Tree.BinaryTreeCreate.Node;

public class TreeTravel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void printInOrder(Node node) {
	    if (node != null) {
	      printInOrder(node.left);
	      System.out.println("  Traversed " + node.value);
	      printInOrder(node.right);
	    }
	}
	
	public void postOrder(TreeNode root) {
		  if(root !=  null) {
		   postOrder(root.left);
		   postOrder(root.right);
		   //Visit the node by Printing the node data  
		   System.out.printf("%d ",root.data);
		  }
	}

	//prints in level order/ in order non recursion
		public static void levelOrderTraversal(TreeNode startNode) {
			Queue<TreeNode> queue=new LinkedList<TreeNode>();
			queue.add(startNode);
			while(!queue.isEmpty())
			{
				TreeNode tempNode=queue.poll();
				System.out.printf("%d ",tempNode.data);
				if(tempNode.left!=null)
					queue.add(tempNode.left);
				if(tempNode.right!=null)
					queue.add(tempNode.right);
			}
		}
		

		//print leaf nodes
		public static void printLeafNodes(TreeNode node) {

		if(node==null)
		 return;

		if(node.left == null && node.right == null) {
		 System.out.printf("%d ",node.data);
		}
		printLeafNodes(node.left);
		printLeafNodes(node.right);
		}

		
		/* To get the count of leaf nodes in a binary tree*/
		public static  int getLeafCount(TreeNode node)
		{
		  if(node == null)      
		    return 0;
		  if(node.left ==null && node.right==null)     
		    return 1;           
		  else
		    return getLeafCount(node.left)+ getLeafCount(node.right);     
		}


		
}

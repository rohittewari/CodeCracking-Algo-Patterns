package MyCodes.Tree;

public class TreeMaxDepth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	int maxDepth(TNode tnode) {
	    if (tnode == null) {
	        return (0);
	    } else {
	        // compute the depth of each subtree
	        int lDepth = maxDepth(tnode.left);
	        int rDepth = maxDepth(tnode.right);
	        // use the larger one
	        if (lDepth > rDepth)
	            return (lDepth + 1);
	        else
	            return (rDepth + 1);
	    }	    


}

}

class TNode {
	TNode left;
	TNode right;
	
}
package MyCodes.Tree;

public class InsertCreateTreeNode {
    
	static TreeNode root;
	
	public static void main(String[] args) throws Exception {
		// construct binary tree
        int[] arr = { 20, 15, 25, 12, 18, 22, 28 };
        for (int i = 0; i < arr.length; i++) {
            root = insert(arr[i], root);
        } 


	}

	
	protected static TreeNode insert( int x, TreeNode t ) throws Exception { 
        if( t == null )
            t = new TreeNode( x );
        else if( x < t.data )
            t.left = insert( x, t.left );
        else if( x > t.data )
            t.right = insert( x, t.right );
        else
            throw new Exception( );  // Duplicate
        return t;
    }
	
	//While Loop for insertion:
		public TreeNode insert(int val){
			TreeNode parent = null;
            TreeNode current = root;
            
		        if( root == null){
		            root = new TreeNode(val);
		            System.out.println("Root inserted");
		            return root;
		        }
		        else{
		            
		            while( current != null){
		                if( val <current.data ){
		                    parent = current;
		                    current = current.left;
		                }
		                else if ( val > current.data ){
		                    parent = current;
		                    current = current.right;
		                }
		               
		            }

		            if(val <parent.data ) {
		                parent.left =new TreeNode(val);
		                System.out.println("left inserted: "+ val);
		            }
		            else {
		                parent.right =new TreeNode(val);
		                System.out.println("right inserted: "+ val);
		            }
		            }            
		            return parent;
		        
		    } 
		
		// Get Nth code
		public TreeNode GetNode(int val){

	           TreeNode current = root;
	            while( current != null){

	             if (val  == current.data){
	                System.out.println("got Node: "+val);
	                break;
	             }

	             if( val <current.data ){
	                 current = current.left;
	             }
	                else if ( val > current.data ){
	                 current = current.right;
	             }
	                
	            }
	           
	            return current;        
	    } 
	 


 

}

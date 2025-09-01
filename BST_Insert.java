public class Main {

    public static void main(String[] args) {

        BinarySearchTree myBST = new BinarySearchTree();

        myBST.insert(2);
        myBST.insert(1);
        myBST.insert(3);

        /*
            THE LINES ABOVE CREATE THIS TREE:
                         2
                        / \
                       1   3
        */


        System.out.println("Root: " + myBST.getRoot().value);
        System.out.println("\nRoot->Left: " + myBST.getRoot().left.value);
        System.out.println("\nRoot->Right: " + myBST.getRoot().right.value);


        /*
            EXPECTED OUTPUT:
            ----------------
            Root: 2

            Root->Left: 1

            Root->Right: 3

        */



      
    }

}
//////////////////////////////////////////////////////////////////////////////
BST CLASS:
  public class BinarySearchTree {
	
     Node root;

    class Node {
        public int value;
        public Node left;
        public Node right;

        Node(int value) {
            this.value = value;
        }
    }

	public Node getRoot() {
        return root;
    }

	public boolean insert(int value){
	    Node newNode = new Node(value);
	    
	    if(root==null){
	        root = newNode;
	        return true;
	    }
	    Node temp = root;
	    
	    while(true){
	        if(newNode.value==temp.value){return false;}
	        if(newNode.value<temp.value){
	            if(temp.left==null){ 
	                temp.left=newNode;
	                return true;
	            }
	        temp = temp.left;
	    }else{
	        if(newNode.value>temp.value){
	            if(temp.right==null){ 
	                temp.right = newNode;
	                return true;
	            }
	        }
	    }
	
	}
	

}
}

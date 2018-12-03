/**
 * A class to implement a binary tree and traverse it (in order) 
 * @date November 25, 2018
 * @author Kathryn Cole and James Migdal 
 */

public class BinaryTree {
    BinaryNode root;

    public BinaryTree() {
        root = null;
    }

    public void inorderTraversal( BinaryNode node ) {
        if( node == null ) {
            return;
        }
        inorderTraversal( node.left );
        System.out.print( node.data + " " );
        inorderTraversal( node.right );
    }

    public static void main( String[] args ) {
        BinaryTree tree = new BinaryTree();
        tree.root = new BinaryNode(78);
        tree.root.left = new BinaryNode(31);
        tree.root.right = new BinaryNode(63);
        System.out.println( "inorder traversal: " );
        tree.inorderTraversal( tree.root ); //should print 31 78 63

        tree.root.left.left = new BinaryNode(45);
        tree.root.left.right = new BinaryNode(8);
        tree.root.right.left = new BinaryNode(66);
        tree.root.right.right = new BinaryNode(23);
        System.out.println( "\nnew inorder traversal: " );
        tree.inorderTraversal( tree.root ); //should print 45 31 8 78 66 63 23

        BinaryTree treeTwo = new BinaryTree();
        treeTwo.root = new BinaryNode(6);
        treeTwo.root.left = new BinaryNode(5);
        treeTwo.root.left.left = new BinaryNode(4);
        treeTwo.root.left.left.left = new BinaryNode(3);
        treeTwo.root.left.left.left.left = new BinaryNode(2);
        treeTwo.root.left.left.left.left.left = new BinaryNode(1);
        System.out.println( "\ninorder traversal of treeTwo: " );
        treeTwo.inorderTraversal( treeTwo.root ); //should print 1 2 3 4 5 6

        BinaryTree treeThree = new BinaryTree();
        treeThree.root = new BinaryNode(1);
        treeThree.root.left = new BinaryNode(0);
        treeThree.root.right = new BinaryNode(2);
        treeThree.root.right.right = new BinaryNode(3);
        treeThree.root.right.right.right = new BinaryNode(4);
        treeThree.root.right.right.right.right = new BinaryNode(5);
        treeThree.root.right.right.right.right.right = new BinaryNode(6);
        System.out.println( "\ninorder traversal of treeThree: " );
        treeThree.inorderTraversal( treeThree.root ); //should print 0 1 2 3 4 5 6
    }

}
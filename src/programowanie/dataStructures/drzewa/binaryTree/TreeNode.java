package programowanie.dataStructures.drzewa.binaryTree;

public class TreeNode {
    TreeNode leftChild;
    TreeNode rightChild;
    public int value;
    int data;



    public TreeNode(int value) {
        this.value = value;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }
}

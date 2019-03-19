package programowanie.dataStructures.drzewa.binaryTree;

import java.util.*;

public class MyBinaryTree {

    public TreeNode root;


    public MyBinaryTree(TreeNode root) {
        this.root = root;
    }

    public MyBinaryTree(int data) {
        TreeNode root = new TreeNode(data);
        this.root = root; // pole naszej kalsy i odwolujemy sie do zmiennej wczesniej
    }

    // tworzymy preorder, otrzymywac musi node, (NLR)
    // dopisac wezel,
    // wywolac sama siebie na lewym dziecku
    // wywolac sama siebie na prawym dziecku

    // metoda od Marcina PRE-ORDER
    public static List<Integer> traversePreOrder(MyBinaryTree tree) { // NLR
        List<Integer> listaWynikowa = new ArrayList<>();
        preOrder(tree.root, listaWynikowa);
        return listaWynikowa;
    }

    // metoda od Marcina
    private static void preOrder(TreeNode node, List<Integer> lista) {
        if (node == null) {
            return;
        }
        lista.add(node.value);
        preOrder(node.leftChild, lista);
        preOrder(node.rightChild, lista);
    }


    // =================================================================================================================

    public static void myInOrder(TreeNode node, List elementList) { // LNR

        if (node == null) {
            return;
        }

        myInOrder(node.leftChild, elementList);   // left subtree
        elementList.add(node.value); // node
        myInOrder(node.rightChild, elementList); // right subtree
    }

    public static List<Integer> myTranverseInOrder(MyBinaryTree tree) {
        List<Integer> elementList = new ArrayList<>();
        myInOrder(tree.root, elementList);
        return elementList;

    }

    // =============================================================================================================


    public static void postOrder(TreeNode node, List elementList) { // LNR
        if (node == null) {
            return;
        }
        postOrder(node.leftChild, elementList);
        postOrder(node.rightChild, elementList);
        elementList.add(node.value);
    }

    public static List<Integer> myTraversePostOrder(MyBinaryTree tree) {
        List<Integer> elementList = new ArrayList<>();
        postOrder(tree.root, elementList);
        return elementList;
    }


// ====================================================================================================================
    // METODA ADD =====================================================================================================

    public void add(int value) {
        root = addRecursive(value, root);
    }

    // przykladowe drzewo na losowanie miejsca
    private static TreeNode addRecursive(int value, TreeNode current) {
        if (current == null) { // jesli jest pusty to mozemy dodac node // current.lefChild - na lewe dziecko przechodzimy
            return new TreeNode(value);
        }
        Random rand = new Random(); // losujemy na ktore miejsce
        int n = rand.nextInt(2);

        // warunek else bez elsa
        if (n == 0) {
            current.setLeftChild(addRecursive(value, current.getLeftChild()));
        } else {
            current.setRightChild(addRecursive(value, current.getRightChild()));
        }
        return current;
    }

    public void add2(int value) { // raczej źle
        TreeNode nodeToAdd = new TreeNode(value);
        if (root == null) {
            root = nodeToAdd;

            // if data < node, traverse left child, else traverse right child
            // until we get to node that we can't traverse, insert our new node

            traverseAndAddNode(root, nodeToAdd);

        }
    }

    private void traverseAndAddNode(TreeNode node, TreeNode nodeToAdd) { // źle
        if (nodeToAdd.data < root.data) {
            if (node.leftChild == null) {
                node.leftChild = nodeToAdd;
            } else {
                traverseAndAddNode(node.leftChild, nodeToAdd);
            }
        } else if (nodeToAdd.data > root.data) {
            if (node.rightChild == null) {
                node.rightChild = nodeToAdd;
            } else {
                traverseAndAddNode(node.rightChild, nodeToAdd);
            }
        }
    }


    public void preOrderTraversal(TreeNode node) {
        System.out.println(node.data);
        if (node.leftChild != null) {
            preOrderTraversal(node.leftChild);
        }
        if (node.rightChild != null) {
            preOrderTraversal(node.rightChild);
        }
    }
    // metoda traversePreOrder z wykorzystaniem stosu - bez rekurencji! // node, left, right

    public static void traversePreOrderIterative(TreeNode node) { // nie wiem jak wywołać :/
        if (node == null) {
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.add(node);
        while (!stack.isEmpty()) {
            node = stack.pop();
            System.out.println(node.value); // powinno byc root.value
        }
        if (node.rightChild != null) {
            stack.push(node.rightChild);
        }
        if (node.leftChild != null) {
            stack.push(node.rightChild);
        }
    }

// metoda level order ???????????????????????

    public static void levelOrder(TreeNode node, Queue queue) {
        if (node == null) {
            return;
        }
        queue.add(node.value);
        levelOrder(node.leftChild, queue);
        levelOrder(node.rightChild, queue);

    }

    public static Queue<Integer> traverseLeverOrder(MyBinaryTree tree) {
        Queue<Integer> queue = new LinkedList<>();

        levelOrder(tree.root, queue);
        return queue;

    }


    // liczba liści  -> jak wywołać ??????

    public int countLeaves(TreeNode root) {

        List<TreeNode> listaWynikowa = new ArrayList<>();

        int count = 0;
        if (root == null) {
            return 0;
        } else if (root.leftChild == null && root.rightChild == null) {
            count++;
        } else {
            countLeaves(root.leftChild);
            countLeaves(root.rightChild);
        }
        return count;
    }
}




























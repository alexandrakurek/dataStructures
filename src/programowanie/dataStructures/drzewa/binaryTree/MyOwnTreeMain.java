package programowanie.dataStructures.drzewa.binaryTree;

import java.util.ArrayList;
import java.util.List;


public class MyOwnTreeMain {
    public static void main (String []arg){

        MyBinaryTree myBinaryTree = new MyBinaryTree(10);

        myBinaryTree.add(5);
        myBinaryTree.add(10);
        myBinaryTree.add(15);
        myBinaryTree.add(20);
        myBinaryTree.add(25);
        myBinaryTree.add(30);
        myBinaryTree.add(35);







        System.out.println(MyBinaryTree.traversePreOrder(myBinaryTree));
        System.out.println(MyBinaryTree.myTranverseInOrder(myBinaryTree));
       System.out.println(MyBinaryTree.myTraversePostOrder(myBinaryTree));
       // System.out.println(myBinaryTree.countLeaves());





















    }


}

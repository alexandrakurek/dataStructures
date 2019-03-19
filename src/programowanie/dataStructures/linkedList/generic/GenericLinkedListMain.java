package programowanie.dataStructures.linkedList.generic;


public class GenericLinkedListMain {
    public static void main(String[] arg) {
        GenericNode<Integer> firstGenericNode = new GenericNode<>(9);
        GenericNode<Integer> second = new GenericNode<>(4);
        GenericNode<Integer> third = new GenericNode<>(9);
        GenericLinkedList<GenericNode> listaGenericNode = new GenericLinkedList<>(firstGenericNode);
        listaGenericNode.addAtIndex(1, firstGenericNode);

        System.out.println(listaGenericNode.getSize());
       // listaGenericNode.addAtHead(second);
        listaGenericNode.addTail(third);

        System.out.println(listaGenericNode.getSize());

        listaGenericNode.addTail(second);
        System.out.println(listaGenericNode.getSize());

        listaGenericNode.printGenericList();


    }

}

package balazs.dsa1.bst;

public class TreeCompareHelper<T extends Comparable<T>> {
    public boolean compareTrees(Node<T> node1, Node<T> node2){
        if(node1 == null || node2 == null) return node1 == node2;
        if(node1.getData().compareTo(node2.getData()) != 0) return false;
        return compareTrees(node1.getLeftChild(), node2.getLeftChild()) &&
                compareTrees(node1.getRightChild(), node2.getRightChild());
    }
}

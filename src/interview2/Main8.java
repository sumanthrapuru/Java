package interview2;

import java.util.Stack;

//import static jdk.internal.org.objectweb.asm.util.Printer.printList;

public class Main8 {

    static class Node{
        int value;
        Node left, right;

        public Node(int value, Node left, Node right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public Node(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {

        /**
         *           1
         *         /  \
         *        2    3
         *       / \   / \
         *      4   5  6  7
         *       \
         * 	   8
         */
//
//        Node root = new Node(1);
//        root.left = new Node(2);
//        root.left.left = new Node(4);
//        root.left.left.right = new Node(8);
//        root.left.right = new Node(5);
//        root.right = new Node(3);
//        root.right.left = new Node(6);
//        root.right.right = new Node(7);
//
//
//        new Main8().printRootToLeaf(root);

        // 1258   136




        // 4 5 7 9 2 7
        // 7 9 2 7    4 5

        /**
         * after k  (new head)
         * at k next= null
         * oldhead
         * last .next = oldhead
         */


        LNode head = new LNode(4);
        head.next = new LNode(5);
        head.next.next = new LNode(7);
        head.next.next.next = new LNode(9);
        head.next.next.next.next = new LNode(2);
        head.next.next.next.next.next = new LNode(7);
        head.next.next.next.next.next.next = new LNode(0);
        head.next.next.next.next.next.next.next = new LNode(3);
        head.next.next.next.next.next.next.next.next = new LNode(8);

        LNode newHead = new Main8().rotateList(head, 0);

        printList(newHead);

    }

    private static void printList(LNode newHead) {
        while(newHead != null){
            System.out.print(newHead.value+" ");
            newHead = newHead.next;
        }
    }

    static class LNode{
        int value;
        LNode next;

        public LNode(int value, LNode next) {//7 4 9||5 7-4 = 1
            this.value = value;
            this.next = next;
        }

        public LNode(int value) {
            this.value = value;
        }
    }
    LNode rotateList(LNode head, int k){//k < length, no cycle
        if(k <= 0 || head == null || head.next == null){
            return head;
        }

        //k = k % length
        LNode oldHead = head;
        LNode temp = head;
        while(k-- > 1){
            temp = temp.next;
        }
        LNode newHead = temp.next;
        temp.next = null;


        LNode last = newHead;
        while(last.next != null){
            last = last.next;
        }

        last.next = oldHead;

        return newHead;
    }

    static Stack<Node> stack = new Stack<>();

    void printRootToLeaf(Node root){
        if(root == null) return;
        if(root.left == null && root.right == null) {
            stack.add(root);
            printStack(stack);
            stack.pop();
            return;
        }

        stack.add(root);
        printRootToLeaf(root.left);
        printRootToLeaf(root.right);
        stack.remove(root);
    }

    void printStack(Stack<Node> stack){
        for(int i = 0; i < stack.size(); i++){
            System.out.print(stack.get(i).value+"->");
        }
        System.out.println();
    }

}

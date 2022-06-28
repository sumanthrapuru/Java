package interview;
class TNode{

    int value;
    TNode next;

    public TNode(int value) {
        this.value = value;
    }
}
public class Demo12 {

    public static void main(String[] args) {
        //9-2-2
        //1-9-9

        //

        TNode head = new TNode(9);
        head.next = new TNode(2);
        head.next.next = new TNode(2);


        TNode head2 = new TNode(1);
        head2.next = new TNode(9);
        head2.next.next = new TNode(9);

        TNode result = new Demo12().add(head, head2);
        traverse(result);

    }


    static void traverse(TNode head){
        TNode temp = head;
        while (temp != null){
            System.out.print(" "+temp.value+" ");
            temp = temp.next;
        }
    }

    TNode add(TNode list1, TNode list2){
        TNode temp1 = list1;
        TNode temp2 = list2;
        TNode result = null;
        TNode resultEnd = null;


        int carry = 0;
        while (temp1 != null && temp2 != null){
            int sum = temp1.value + temp2.value + carry;
            carry = sum / 10;
            int value = sum % 10;

            if(result == null){
                result = resultEnd = new TNode(value);
            } else {
                resultEnd.next = new TNode(value);
                resultEnd = resultEnd.next;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        if(temp2 == null){
            getRemaining(temp1, resultEnd, carry);
        }

        return result;
    }

    void getRemaining(TNode head, TNode resultEnd, int carry){
        while (head != null){
            int sum = head.value + carry;
            carry = sum / 10;
            int value = sum % 10;
            resultEnd.next = new TNode(value);
            resultEnd = resultEnd.next;
            head = head.next;
        }
        if(carry != 0){
            resultEnd.next = new TNode(carry);
            resultEnd = resultEnd.next;
        }
    }

    /*
    * abcdadjk

len=4

{
a:4,
b:1
c:2
d:5*/



}

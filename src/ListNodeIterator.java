import java.util.LinkedList;
import java.util.List;


public class ListNodeIterator {

    public static void main(String[] args) {

        ListNode list = new ListNode(0,
                new ListNode(1,
                        new ListNode(2,
                                new ListNode(3,
                                        new ListNode(4,
                                                new ListNode(5, null))))));

        ListNode fromEnd = getFromEnd(list, 3);
        System.out.println(fromEnd.value);
    }

    private static ListNode getFromEnd(ListNode listNode, int index) {
        int count = 0;
        ListNode headNode = listNode;
        ListNode searchNode = null;

        while (listNode != null) {

            if (count == index) {
                searchNode = headNode;
            } else if (count > index) {
                searchNode = searchNode.next();
            }

            listNode = listNode.next();
            count++;
        }

        return searchNode;
    }

    private static class ListNode {
        private int value;
        private ListNode next;

        public ListNode(int value, ListNode next) {
            this.value = value;
            this.next = next;
        }

        public ListNode next() {
            return this.next;
        }
    }
}
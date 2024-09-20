// 876.链表的中间结点
// 给你单链表的头结点 head，请你找出并返回链表的中间结点。
// 如果有两个中间结点，则返回第二个中间结点。
public class _876MiddleOfTheLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode middleNode = middleNode(head);
        System.out.println(middleNode.val);
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode middleNode(ListNode head) {
        ListNode mid = head;
        ListNode temp = head;
        int n = 0;
        while (temp != null) {
            temp = temp.next;
            n++;
        }
        for (int i = 0; i < n / 2; i++) {
            mid = mid.next;
        }
        return mid;
    }
}
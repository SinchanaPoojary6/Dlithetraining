
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) {
        this.val = val; this.next = next; }
}

public class Main {
    public static void main(String[] args) {
        int[] values1 = {2, 4, 3};
        int[] values2 = {5, 6, 4};

        ListNode head1 = createLinkedList(values1);
        ListNode head2 = createLinkedList(values2);

        Main addLinkedLists = new Main();
        ListNode result = addLinkedLists.addTwoNumbers(head1, head2);

        System.out.println("List 1: ");
        printLinkedList(head1);

        System.out.println("List 2: ");
        printLinkedList(head2);

        System.out.println("Result: ");
        printLinkedList(result);
    }
    public ListNode addTwoNumbers(ListNode head1, ListNode head2) {
        ListNode dummyHead = new ListNode();
        ListNode current = dummyHead;
        int carry = 0;

        while (head1 != null || head2 != null) {
            int val1 = (head1 != null) ? head1.val : 0;
            int val2 = (head2 != null) ? head2.val : 0;

            int total = val1 + val2 + carry;
            carry = total / 10;

            current.next = new ListNode(total % 10);
            current = current.next;

            if (head1 != null)
                head1 = head1.next;
            if (head2 != null)
                head2 = head2.next;
        }

        if (carry > 0)
            current.next = new ListNode(carry);

        return dummyHead.next;
    }

    // Helper function to create a linked list from an array of values
    public static ListNode createLinkedList(int[] values) {
        ListNode dummyHead = new ListNode();
        ListNode current = dummyHead;
        for (int val : values) {
            current.next = new ListNode(val);
            current = current.next;
        }
        return dummyHead.next;
    }
    public static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

}

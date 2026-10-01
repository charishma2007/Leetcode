class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        // Dummy node to store result
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        int carry = 0;

        // Traverse both linked lists
        while (l1 != null || l2 != null || carry != 0) {

            int sum = carry;

            // Add value from l1
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            // Add value from l2
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            // Calculate carry
            carry = sum / 10;

            // Create new node with digit
            current.next = new ListNode(sum % 10);

            // Move current pointer
            current = current.next;
        }

        // Return result list
        return dummy.next;
    }
}
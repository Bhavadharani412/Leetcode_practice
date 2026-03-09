class Solution {
    public void reorderList(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode curr = head;
        while (curr != null) {
            arr.add(curr.val);
            curr = curr.next;
        }
        curr = head;
        int i = 0, j = arr.size() - 1;
        boolean bit = true;
        while (curr != null) {
            if (bit) curr.val = arr.get(i++);
            else curr.val = arr.get(j--);
            bit = !bit;
            curr = curr.next;
        }
    }
}
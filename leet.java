/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        
        if(t1 == null) {
            return t2;
        }
        
        if (t2 == null) {
            return t1;
        }
        
        t1.val += t2.val;
        t1.left = mergeTrees(t1.left. t2.left);
        t1.right = mergeTrees(t1.right, t2.right);
        return t1;
    }
}

////////////////////////////////////////////////////////////////

//   Sort Array By Parity

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        
        int[] new_arr = new int[nums.length];
        int counter = 0;
        
        for (int i=0; i<nums.length; i++) {
            if (nums[i] % 2 == 0) {
                new_arr[counter] = nums[i];
                counter++;
            }
        }
        
        for (int i=0; i<nums.length; i++) {
            if (nums[i] % 2 == 1) {
                new_arr[counter] = nums[i];
                counter++;
            }
        }
        
        return new_arr;
        
    }
}

/////////////////////////////////////////////////////////////////

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        
        return prev;
    }
}
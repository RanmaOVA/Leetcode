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

////////////////////////////////////////////////////

//           Two Sum

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
       for (int i=0; i<nums.length; i++) {
           for (int j=i+1; j<nums.length; j++) {
                int complement = target -nums[i];
               
               if (nums[j] == complement) {
                   return new int[] {i, j};
               }
           }
       }
       
        throw new IllegalArgumentException("no match found");
        
    }
}


/////////////////////////////////////////////////

//         Reverse String

class Solution {
    public void reverseString(char[] s) {
        
        
        int a_pointer = 0;
        int b_pointer = s.length-1;
        
        while (a_pointer <= b_pointer) {
            char temp = s[a_pointer];
            s[a_pointer] = s[b_pointer];
            s[b_pointer] = temp;
            
            a_pointer += 1;
            b_pointer -= 1;
        }
    }
}

////////////////////////////////////////////////

//////  Find First and Last Position of Element in Sorted Array

class Solution {
    public int searchValueInUnsortedArray(int[] arr, int val) {
        if(arr.length == 0){
            return -1;
        }
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == val) {
                return i;
            }
        }
        
        return -1;
    }
}
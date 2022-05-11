package SingleList;
import java.io.PrintStream;
import java.util.*;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class PalindromeList {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(3);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(2);
        ListNode l5 = new ListNode(1);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        ListNode head = l1;
        System.out.println(new PalindromeList().chkPalindrome(head));
    }
    public boolean chkPalindrome(ListNode A) {
        // write code here
        ListNode slow = A;
        ListNode fast = A;
        ListNode head = A;
        while(fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode end = reverse(slow);
        while(end!=null&&head!=null){
            if(end.val!=head.val){
                return false;
            }else{
                end = end.next;
                head = head.next;
            }
        }
        return true;
    }
    public ListNode reverse(ListNode A){
        if(A==null) return null;
        ListNode prev = A;
        ListNode p1 = A;
        ListNode p2 = A.next;
        A.next = null;
        while(prev!=null){
            p1 = p2;
            if(p2!=null) {
                p2 = p2.next;
                p1.next = prev;
            }
            prev = p1;
        }
        return prev;
    }
}
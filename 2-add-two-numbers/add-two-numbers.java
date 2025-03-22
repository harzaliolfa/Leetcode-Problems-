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
import java.math.BigInteger;

class Solution {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<Integer> l1_list=new ArrayList<Integer>();
        List<Integer> l2_list=new ArrayList<Integer>();
        List<Integer> l3_list=new ArrayList<Integer>();
        String str_num_1="";
        String str_num_2=""; ListNode dummy=new ListNode(0);
       
        BigInteger l1_int;
        BigInteger l2_int;
        while (l1 != null) {
        l1_list.add(l1.val);
        l1 = l1.next;
    }
        while (l2 != null) {
        l2_list.add(l2.val);
        l2 = l2.next;
    }
        for(int i=l1_list.size()-1 ; i >= 0;i--)
        {
             str_num_1 =str_num_1+ Integer.toString(l1_list.get(i));
        }
         for(int i=l2_list.size()-1 ; i >= 0;i--)
        {
             str_num_2 =str_num_2+  Integer.toString(l2_list.get(i));
        }
        l1_int=new BigInteger(str_num_1);
        l2_int=new BigInteger(str_num_2);
        BigInteger result=l1_int.add(l2_int);
        String resultString = String.valueOf(result);
        System.out.println(resultString);
         ListNode current = dummy;


         for (int i = resultString.length() - 1; i >= 0; i--) {
             current.next = new ListNode(resultString.charAt(i)-'0');
            //  System.out.println("l3 char"+l3.val);

             current = current.next;
            //  System.out.println("l3 val : "+l3.val);
          // Move to the next node

}

        //   System.out.println("last val "+l3.val);
        return dummy.next;


    }
}
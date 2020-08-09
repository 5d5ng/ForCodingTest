package easy;

import java.util.ArrayList;

public class Reversed_Linked_List206 {

    public ListNode reverseList(ListNode head){
        ArrayList<Integer> list = new ArrayList<>();
        ListNode ans = new ListNode();
        while(head!=null){
            list.add(head.val);
            head = head.next;
        }
        ListNode temp = ans;
        while (!list.isEmpty()){
            temp.val = list.remove(list.size()-1);
            temp.next = new ListNode();
            temp = temp.next;
        }
        return ans;
    }
}


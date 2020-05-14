public class MergeTwoSortedLists {
    public class ListNode {
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

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null&&l2==null) return null;
        ListNode res = new ListNode();
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode ans = res;
        while(temp1!=null && temp2!=null){
            int t1 = temp1.val;
            int t2 = temp2.val;
            if(t1<=t2){
                ans.val = t1;
                temp1 = temp1.next;
            }
            else{
                ans.val = t2;
                temp2 = temp2.next;
            }
            ans.next = new ListNode();
            ans = ans.next;

        }

        while(temp1!=null){
            ans.val = temp1.val;
            temp1 = temp1.next;

            if(temp1==null){
                break;
            }
            ans.next = new ListNode();
            ans = ans.next;
        }
        while(temp2!=null){
            ans.val = temp2.val;
            temp2 = temp2.next;


            if(temp2==null){
                break;
            }
            ans.next = new ListNode();
            ans = ans.next;
        }


        return res;
    }
}

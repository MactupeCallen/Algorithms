package Algorithm;

import Algorithm.domain.ListNode;
/**
 *@Auther:Mactupe
 *@Date:2020/3/24-14:07
 *@Description:输入两个单调递增的链表，输出两个链表合成后的链表
 */
public class ComposeListNode {

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        ListNode list2 = new ListNode(4);
        ListNode list3 = new ListNode(9);
        ListNode list4 = new ListNode(10);
        ListNode list5 = new ListNode(23);
        ListNode list6 = new ListNode(25);
        list1.next  = list2;
        list2.next  = list3;
        list3.next  = list4;
        list4.next  = list5;
        list5.next  = list6;

        ListNode node1 = new ListNode(0);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(5);
        ListNode node4 = new ListNode(13);
        ListNode node5 = new ListNode(24);
        ListNode node6 = new ListNode(27);
        node1.next  = node2;
        node2.next  = node3;
        node3.next  = node4;
        node4.next  = node5;
        node5.next  = node6;

        ListNode mergeList = Merge(list1, node1);
        while(null != mergeList.next){
            System.out.print(" " + mergeList.val);
            mergeList = mergeList.next;
        }
    }

    public static ListNode Merge(ListNode list1, ListNode list2) {
        if(list1==null){
            return list2;
        }else if(list2==null){
            return list1;
        }
        ListNode pMergeHead = null;
        if(list1.val<list2.val){
            pMergeHead = list1;
            pMergeHead.next = Merge(list1.next,list2);
        }else{
            pMergeHead = list2;
            pMergeHead.next = Merge(list1,list2.next);
        }
        return pMergeHead;
    }
}

package Algorithm;

import Algorithm.domain.ListNode;

import java.util.List;

/**
 *@Auther:Mactupe
 *@Date:2020/3/21-14:30
 *@Description:输入一个链表，反转链表后，输出新链表的表头。--未完成
 */
public class RevList {

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        ListNode list2 = new ListNode(2);
        ListNode list3 = new ListNode(3);
        ListNode list4 = new ListNode(4);
        ListNode list5 = new ListNode(5);
        ListNode list6 = new ListNode(6);
        list1.next  = list2;
        list2.next  = list3;
        list3.next  = list4;
        list4.next  = list5;
        list5.next  = list6;
        ListNode returnList = ReverseList(list1);
        System.out.println("表头值为：" + returnList.val);
    }

    public static ListNode ReverseList(ListNode head) {
        if (null == head || null == head.next){
            return head;
        }
        while (null != head.next){
            ListNode preNode = null;
            ListNode Node = head;
            ListNode lastNode = head.next;
            preNode = head;

        }

        /**
         * if(head==null)
         *             return null;
         *         ListNode newHead = null;
         *         ListNode pNode = head;
         *         ListNode pPrev = null;
         *         while(pNode!=null){
         *             ListNode pNext = pNode.next;
         *             if(pNext==null)
         *                 newHead = pNode;
         *             pNode.next = pPrev;
         *             pPrev = pNode;
         *             pNode = pNext;
         */
        return head;
    }
}

package Algorithm;

import Algorithm.domain.ListNode;

/**
 *@Auther:Mactupe
 *@Date:2020/3/20-13:57
 *@Description:输入一个链表，输出该链表中倒数第k个结点。
 */
public class ListBackIndex {

    public static int index = 0;
    public static int countNext = 0;
    public static ListNode resultList = new ListNode(0);

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
        System.out.println("当前list的层数为：" + isNext(list1));
        countNext = 0;  //层数展示后清零
        ListNode listNode = FindKthToTail(list1, 2);
        System.out.println("ListNode为：" + listNode.val);

    }

    //查找方法
    public static ListNode FindKthToTail(ListNode head, int k) {
        if (null == head.next){
            return resultList;
        }
        int lengthOfList = isNext(head);
        if (lengthOfList < k){
            return resultList;
        }
        int order = lengthOfList - k;   //将k转换为正序order
        find(head,order);
        return resultList;
    }
    //递归查找方法
    public static void find(ListNode listNode, int order){
        System.out.println(listNode.val);
        if (index == order){
            resultList = listNode;
            System.out.println(resultList.val);
        }
        else{
            index++;
            find(listNode.next,order);
        }
    }

    /**
     * listNode的长度
     * @param listNode
     * @return int
     */
    public static int isNext(ListNode listNode){
        if (null != listNode){
            isNext(listNode.next);
            countNext++;
        }
        return countNext;
    }
}

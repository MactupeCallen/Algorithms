package Algorithm;

import Algorithm.domain.ListNode;

import java.util.ArrayList;

/**
 * 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。	
 * public class ListNode {
 *		int val;
	
		ListNode next = null;
	
		ListNode(int val) {
		this.val = val;
		}
	}

 * @author mactupe
 *
 */
public class PrintList {

	private static ArrayList<Integer> arr=new ArrayList<Integer>();

	public static void main (String[] args) {
		ListNode listNode = new ListNode(123);
		ArrayList<Integer> arr = printListFromTailToHead(listNode);
		System.out.println(arr.toString());
	}
	
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if(listNode!=null)
        {
            printListFromTailToHead(listNode.next);
            arr.add(listNode.val);
        }
        return arr;
    }
}

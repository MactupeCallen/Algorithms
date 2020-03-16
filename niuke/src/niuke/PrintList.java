package niuke;

import niuke.domain.ListNode;

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

	public void main (String[] args) {
		ListNode listNode = new ListNode(123);
		ArrayList<Integer> arr = printListFromTailToHead(listNode);
		System.out.println(arr.toString());
	}
	
	ArrayList<Integer> arr=new ArrayList<Integer>();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if(listNode!=null)
        {
            this.printListFromTailToHead(listNode.next);
            arr.add(listNode.val);
        }
        return arr;
    }
}

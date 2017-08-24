package com.linkedlist;
/**
 * 输入一个链表，从尾到头打印链表每个节点的值。
 * @author caishenchen
 *
 */

import java.util.ArrayList;

public class Demo {
	ArrayList<Integer> arraylist = new ArrayList<Integer>();
	public ArrayList<Integer> printListFromTailToHead(ListNode listnode){
		
		if (listnode!=null) {
			printListFromTailToHead(listnode.next);
			arraylist.add(listnode.val);
		}
		return arraylist;
	}
	public static void main(String[] args) {
		Demo d = new Demo();
		ListNode ln = new ListNode(123);
		System.out.println(d.printListFromTailToHead(ln));
	}
}

package com.linkedlist;
/**
 * �Զ��嵥������
 * @author caishenchen
 *
 */
public class LinkedListDemo {
	//ͷ���
	Node head = new Node();
	public LinkedListDemo() {
		
		Node n1 = new Node();
		n1.data = "��Ԫ";
		n1.next = null;
		Node n2 = new Node();
		n2.data = "����";
		n2.next = null;
		Node n3 = new Node();
		n3.data = "�ض�";
		n3.next = null;
		Node n4 = new Node();
		n4.data = "����";
		n4.next = null;
		
		head.next = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
	}
	public void show() {
		Node p = head.next;
//		System.out.println(p.data);
		while(p!=null) {
			System.out.println(p.data);
			p = p.next;
		}
	}
	public void insert(String data, String ndata) {
		Node n = head.next;
		boolean flag = false;
		while (n!=null) {
			if (n.data.equals(data)) {
				flag = true;
				break;
			} 
			n = n.next;
		}
		if(!flag) {
			return;
		}
		Node n1 = new Node();
		n1.data = ndata;
		n1.next = null;
		n1.next = n.next;
		n.next = n1;
	}
	public static void main(String[] args) {
		LinkedListDemo li = new LinkedListDemo();
		li.insert("����", "����");
		li.show();
	}
}

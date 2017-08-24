package com.linkedlist;

public class Fruit {

	Node head = new Node();
	public Fruit() {
		Node f1 = new Node();
		f1.data = "����";
		f1.next = null;
		
		Node f2 = new Node();
		f2.data = "����";
		f2.next = null;
		
		Node f3 = new Node();
		f3.data = "�Ϲ�";
		f3.next = null;
		
		Node f4 = new Node();
		f4.data = "����";
		f4.next = null;
		
		head.next = f1;
		f1.next = f2;
		f2.next = f3;
		f3.next = f4;
	}
	public void show() {
		Node n = head.next;
		while(n!=null) {
			System.out.println(n.data);
			n = n.next;
		}
	}
	public void insert(String data,String ndata) {
		Node n = head.next;
		Node pre = head;
		boolean bfind = false;
		Node n1 = new Node();
		while(n!=null) {
			if(n.data.equals(data)) {
				bfind = true;
				break;
			}
			pre = n;
			n = n.next;
		}
		if(!bfind) {
			return;
		}
		n1.data = ndata;
		n1.next = n;
		pre.next = n1;
	}
	public void remove(String data) {
		
		Node n = head.next;
		Node pre = head;
		boolean bfind = false;
		while (n!=null) {
			if(n.data.equals(data)) {
				bfind = true;
				break;
			}
			pre = n;
			n = n.next;
		}
		if(!bfind) {
			return;
		}

		pre.next = n.next;
	}
	public static void main(String[] args) {
		Fruit f = new Fruit();
		f.show();
		f.insert("����","�ƹ�");
		System.out.println("--------------------------");
		f.show();
		f.remove("����");
		System.out.println("--------------------------");
		f.show();
	}

}
